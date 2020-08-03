package com.lwh.jtdc.persistence.mapper;

import com.lwh.jtdc.business.vo.TemplateConditionVO;
import com.lwh.jtdc.plugin.BaseMapper;
import com.lwh.jtdc.persistence.beans.SysTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @website https://www.zhyd.me
 * @version 1.0
2018/4/16 16:26
 * @since 1.0
 */
@Repository
public interface SysTemplateMapper extends BaseMapper<SysTemplate> {

    /**
     * 分页查询
     * @param vo
     *
     * @return
     */
    List<SysTemplate> findPageBreakByCondition(TemplateConditionVO vo);
}
