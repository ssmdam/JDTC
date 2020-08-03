package com.lwh.jtdc.business.service;


import com.lwh.jtdc.business.vo.TypeConditionVO;
import com.lwh.jtdc.framework.object.AbstractService;
import com.lwh.jtdc.business.entity.Type;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 分类
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
public interface BizTypeService extends AbstractService<Type, Long> {

    /**
     * 分页查询
     *
     * @param vo
     * @return
     */
    PageInfo<Type> findPageBreakByCondition(TypeConditionVO vo);

    List<Type> listParent();

    List<Type> listTypeForMenu();
}
