package com.lwh.jtdc.business.service;


import com.github.pagehelper.PageInfo;
import com.lwh.jtdc.business.enums.PlatformEnum;
import com.lwh.jtdc.business.vo.LogConditionVO;
import com.lwh.jtdc.framework.object.AbstractService;
import com.lwh.jtdc.business.entity.Log;

/**
 * @author yadong.zhang email:yadong.zhang0415(a)gmail.com
 * @version 1.0
2018/01/09 17:40
 * @since 1.0
 */
public interface SysLogService extends AbstractService<Log, Integer> {

    /**
     * 分页查询
     *
     * @param vo
     * @return
     */
    PageInfo<Log> findPageBreakByCondition(LogConditionVO vo);

    void asyncSaveSystemLog(PlatformEnum platform, String bussinessName);
}
