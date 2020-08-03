package com.lwh.jtdc.controller;

import cn.hutool.core.date.DateUtil;
import com.lwh.jtdc.util.ResultUtil;
import com.lwh.jtdc.business.annotation.BussinessLog;
import com.lwh.jtdc.business.consts.DateConst;
import com.lwh.jtdc.business.service.RemoverService;
import com.lwh.jtdc.framework.object.ResponseVO;
import me.zhyd.hunter.config.HunterConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * Remover：文章爬虫
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
@RestController
@RequestMapping("/remover")
public class RestRemoverController {

    @Autowired
    private RemoverService removerService;

    @PostMapping("/run")
    @ResponseBody
    @BussinessLog("运行文章爬虫")
    public void run(Long typeId, HunterConfig config, HttpServletResponse response) throws IOException, InterruptedException {
        removerService.run(typeId, config, response.getWriter());
    }

    @PostMapping("/stop")
    @ResponseBody
    @BussinessLog("停止文章爬虫")
    public ResponseVO stop() {
        try {
            removerService.stop();
        } catch (Exception e) {
            return ResultUtil.error(e.getMessage());
        }
        return ResultUtil.success("程序已停止运行，当前时间 " + DateUtil.format(new Date(), DateConst.YYYY_MM_DD_HH_MM_SS_EN));
    }

    @PostMapping("/single")
    @ResponseBody
    @BussinessLog("抓取单个文章")
    public void single(Long typeId, String[] url, boolean convertImg, HttpServletResponse response) throws IOException, InterruptedException {
        removerService.crawlSingle(typeId, url, convertImg, response.getWriter());
    }

}
