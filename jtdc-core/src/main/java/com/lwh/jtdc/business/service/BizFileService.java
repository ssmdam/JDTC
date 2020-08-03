package com.lwh.jtdc.business.service;


import com.github.pagehelper.PageInfo;
import com.lwh.jtdc.business.vo.FileConditionVO;
import com.lwh.jtdc.framework.object.AbstractService;
import com.lwh.jtdc.business.entity.File;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author innodev java team
 * @version 1.0
2018/12/14 09:23
 * @since 1.8
 */
public interface BizFileService extends AbstractService<File, Long> {

    PageInfo<File> findPageBreakByCondition(FileConditionVO vo);

    File selectFileByPathAndUploadType(String filePath, String uploadType);

    void remove(Long[] ids);

    int upload(MultipartFile[] file);
}
