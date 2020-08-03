package com.lwh.jtdc.business.service;


import com.github.pagehelper.PageInfo;
import com.lwh.jtdc.business.vo.TagsConditionVO;
import com.lwh.jtdc.framework.object.AbstractService;
import com.lwh.jtdc.business.entity.Tags;

/**
 * 标签
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
public interface BizTagsService extends AbstractService<Tags, Long> {

    PageInfo<Tags> findPageBreakByCondition(TagsConditionVO vo);

    Tags getByName(String name);
}
