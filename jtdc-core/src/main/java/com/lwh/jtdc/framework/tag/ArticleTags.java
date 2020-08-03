package com.lwh.jtdc.framework.tag;

import com.github.pagehelper.PageInfo;
import com.lwh.jtdc.business.enums.ArticleStatusEnum;
import com.lwh.jtdc.business.vo.ArticleConditionVO;
import com.lwh.jtdc.business.entity.Article;
import com.lwh.jtdc.business.service.BizArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Map;

/**
 * 文章相关的自定义标签
 *
 * @author Chris luo 201635020423
 * @since 1.0
 *      调整实现，所有自定义标签只需继承BaseTag后通过构造函数将自定义标签类的className传递给父类即可。
 *      增加标签时，只需要添加相关的方法即可，默认自定义标签的method就是自定义方法的函数名。
 *      例如：<@articleTag method="recentArticles" ...></@articleTag>就对应 {{@link #recentArticles(Map)}}方法
 */
@Component
public class ArticleTags extends BaseTag {

    @Autowired
    private BizArticleService articleService;

    public ArticleTags() {
        super(ArticleTags.class.getName());
    }

    public Object recentArticles(Map params) {
        int pageSize = this.getPageSize(params);
        return articleService.listRecent(pageSize);
    }

    public Object recommendedList(Map params) {
        int pageSize = this.getPageSize(params);
        return articleService.listRecommended(pageSize);
    }

    public Object randomList(Map params) {
        int pageSize = this.getPageSize(params);
        return articleService.listRandom(pageSize);
    }

    public Object hotList(Map params) {
        int pageSize = this.getPageSize(params);
        return articleService.listHotArticle(pageSize);
    }

    public Object typeList(Map params) {
        int pageSize = this.getPageSize(params);
        long typeId = -1;
        String typeStr = getParam(params, "typeId");
        if (!StringUtils.isEmpty(typeStr)) {
            typeId = Long.parseLong(typeStr);
        }
        // 按文章分类查询
        ArticleConditionVO vo = new ArticleConditionVO();
        vo.setTypeId(typeId);
        // 已发布状态
        vo.setStatus(ArticleStatusEnum.PUBLISHED.getCode());
        vo.setPageSize(pageSize);
        PageInfo<Article> pageInfo = articleService.findPageBreakByCondition(vo);
        return null == pageInfo ? null : pageInfo.getList();
    }
}