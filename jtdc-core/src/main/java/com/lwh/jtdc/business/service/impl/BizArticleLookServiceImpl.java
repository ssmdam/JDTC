package com.lwh.jtdc.business.service.impl;

import com.lwh.jtdc.persistence.mapper.BizArticleLookMapper;
import com.lwh.jtdc.business.entity.ArticleLook;
import com.lwh.jtdc.business.service.BizArticleLookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.Date;

/**
 * 文章浏览记录
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
@Service
public class BizArticleLookServiceImpl implements BizArticleLookService {

    @Autowired
    private BizArticleLookMapper bizArticleLookMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ArticleLook insert(ArticleLook entity) {
        Assert.notNull(entity, "ArticleLook不可为空！");
        entity.setUpdateTime(new Date());
        entity.setCreateTime(new Date());
        bizArticleLookMapper.insertSelective(entity.getBizArticleLook());
        return entity;
    }
}
