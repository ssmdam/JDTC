package com.lwh.jtdc.business.service;

import java.util.List;
import java.util.Map;

/**
 * 归档目录
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
public interface BizArticleArchivesService {

    /**
     * 获取归档目录列表
     *
     * @return
     */
    Map<String, List> listArchives();
}
