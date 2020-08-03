package com.lwh.jtdc.business.service;


import com.lwh.jtdc.business.vo.UpdateRecordeConditionVO;
import com.lwh.jtdc.framework.object.AbstractService;
import com.lwh.jtdc.business.entity.UpdateRecorde;
import com.github.pagehelper.PageInfo;

/**
 * 更新记录
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
public interface SysUpdateRecordeService extends AbstractService<UpdateRecorde, Long> {

    PageInfo<UpdateRecorde> findPageBreakByCondition(UpdateRecordeConditionVO vo);
}
