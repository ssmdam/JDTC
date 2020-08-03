package com.lwh.jtdc.persistence.mapper;

import com.lwh.jtdc.business.vo.LogConditionVO;
import com.lwh.jtdc.plugin.BaseMapper;
import com.lwh.jtdc.persistence.beans.SysLog;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yadong.zhang email:yadong.zhang0415(a)gmail.com
 * @version 1.0
2018/01/09 17:45
 * @since 1.0
 */
@Repository
public interface SysLogMapper extends BaseMapper<SysLog> {

    /**
     * 分页查询
     * @param vo
     *
     * @return
     */
    List<SysLog> findPageBreakByCondition(LogConditionVO vo);
}
