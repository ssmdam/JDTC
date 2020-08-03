package com.lwh.jtdc.business.service;

import com.lwh.jtdc.business.entity.Article;
import com.lwh.jtdc.business.entity.Statistics;

import java.util.List;

/**
 * 统计
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
public interface BizStatisticsService {
    /**
     * 获取热门文章
     *
     * @return
     */
    List<Article> listHotArticle(int pageSize);

    /**
     * 获取爬虫统计
     *
     * @return
     */
    List<Statistics> listSpider(int pageSize);

    /**
     * 获取文章分类统计
     *
     * @return
     */
    List<Statistics> listType(int pageSize);

}
