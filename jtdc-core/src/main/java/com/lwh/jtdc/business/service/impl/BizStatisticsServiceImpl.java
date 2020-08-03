package com.lwh.jtdc.business.service.impl;

import com.github.pagehelper.PageHelper;
import com.lwh.jtdc.persistence.beans.BizStatistics;
import com.lwh.jtdc.persistence.mapper.BizStatisticsMapper;
import com.lwh.jtdc.business.entity.Article;
import com.lwh.jtdc.business.entity.Statistics;
import com.lwh.jtdc.business.service.BizArticleService;
import com.lwh.jtdc.business.service.BizStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 统计
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
@Service
public class BizStatisticsServiceImpl implements BizStatisticsService {

    @Autowired
    private BizStatisticsMapper statisticsMapper;
    @Autowired
    private BizArticleService articleService;

    /**
     * 获取热门文章
     *
     * @return
     */
    @Override
    public List<Article> listHotArticle(int pageSize) {
        return articleService.listHotArticle(pageSize);
    }

    /**
     * 获取爬虫统计
     *
     * @return
     */
    @Override
    public List<Statistics> listSpider(int pageSize) {
        PageHelper.startPage(1, pageSize);
        List<BizStatistics> entityList = statisticsMapper.listSpider();
        if (CollectionUtils.isEmpty(entityList)) {
            return null;
        }
        List<Statistics> list = new ArrayList<>();
        for (BizStatistics entity : entityList) {
            list.add(new Statistics(entity));
        }
        return list;
    }

    /**
     * 获取文章分类统计
     *
     * @return
     */
    @Override
    public List<Statistics> listType(int pageSize) {
        PageHelper.startPage(1, pageSize);
        List<BizStatistics> entityList = statisticsMapper.listType();
        if (CollectionUtils.isEmpty(entityList)) {
            return null;
        }
        List<Statistics> list = new ArrayList<>();
        for (BizStatistics entity : entityList) {
            list.add(new Statistics(entity));
        }
        return list;
    }

}
