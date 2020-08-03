package com.lwh.jtdc.business.service;


import com.lwh.jtdc.business.entity.ArticleTags;

import java.util.List;

/**
 * 文章标签
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
public interface BizArticleTagsService {

    int removeByArticleId(Long articleId);

    void insertList(Long[] tagIds, Long articleId);

    ArticleTags insert(ArticleTags entity);

    void insertList(List<ArticleTags> entities);
}
