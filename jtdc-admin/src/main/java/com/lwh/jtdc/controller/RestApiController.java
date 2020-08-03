package com.lwh.jtdc.controller;

import com.lwh.jtdc.business.enums.FileUploadType;
import com.lwh.jtdc.plugin.file.GlobalFileUploader;
import com.lwh.jtdc.util.ResultUtil;
import com.lwh.jtdc.business.annotation.BussinessLog;
import com.lwh.jtdc.core.websocket.server.ZydWebsocketServer;
import com.lwh.jtdc.core.websocket.util.WebSocketUtil;
import com.lwh.jtdc.file.FileUploader;
import com.lwh.jtdc.file.entity.VirtualFile;
import com.lwh.jtdc.framework.object.ResponseVO;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * 其他api性质的接口
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
@RestController
@RequestMapping("/api")
public class RestApiController {

    @Autowired
    private ZydWebsocketServer websocketServer;

    @BussinessLog("wangEditor编辑器中上传文件")
    @RequiresPermissions("article:publish")
    @PostMapping("/uploadFile")
    public ResponseVO uploadFile(@RequestParam("file") MultipartFile file) {
        FileUploader uploader = new GlobalFileUploader();
        VirtualFile virtualFile = uploader.upload(file, FileUploadType.SIMPLE.getPath(), true);
        return ResultUtil.success("图片上传成功", virtualFile.getFullFilePath());
    }

    @BussinessLog("simpleMD编辑器中上传文件")
    @RequiresPermissions("article:publish")
    @PostMapping("/uploadFileForMd")
    public Object uploadFileForMd(@RequestParam("file") MultipartFile file) {
        FileUploader uploader = new GlobalFileUploader();
        VirtualFile virtualFile = uploader.upload(file, FileUploadType.SIMPLE.getPath(), true);
        Map<String, Object> resultMap = new HashMap<>(3);
        resultMap.put("success", 1);
        resultMap.put("message", "上传成功");
        resultMap.put("filename", virtualFile.getFullFilePath());
        return resultMap;
    }

    /**
     * 发送消息通知
     *
     * @return
     */
    @RequiresPermissions("notice")
    @PostMapping("/notice")
    @BussinessLog("通过websocket向前台发送通知")
    public ResponseVO notice(String msg) throws UnsupportedEncodingException {
        WebSocketUtil.sendNotificationMsg(msg, websocketServer.getOnlineUsers());
        return ResultUtil.success("消息发送成功");
    }
}
