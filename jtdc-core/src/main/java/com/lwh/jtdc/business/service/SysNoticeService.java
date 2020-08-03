package com.lwh.jtdc.business.service;


import com.github.pagehelper.PageInfo;
import com.lwh.jtdc.business.dto.SysNoticeDTO;
import com.lwh.jtdc.business.vo.NoticeConditionVO;
import com.lwh.jtdc.framework.object.AbstractService;
import com.lwh.jtdc.business.entity.Notice;

import java.util.List;

/**
 * 系统通知
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
public interface SysNoticeService extends AbstractService<Notice, Long> {

    /**
     * 分页查询
     *
     * @param vo
     * @return
     */
    PageInfo<Notice> findPageBreakByCondition(NoticeConditionVO vo);

    /**
     * 获取已发布的通知列表
     *
     * @return
     */
    List<SysNoticeDTO> listRelease();
}
