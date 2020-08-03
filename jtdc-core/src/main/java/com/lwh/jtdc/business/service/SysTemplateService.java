package com.lwh.jtdc.business.service;


import com.github.pagehelper.PageInfo;
import com.lwh.jtdc.business.enums.TemplateKeyEnum;
import com.lwh.jtdc.business.vo.TemplateConditionVO;
import com.lwh.jtdc.framework.object.AbstractService;
import com.lwh.jtdc.business.entity.Template;

/**
 * 系统模板
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
public interface SysTemplateService extends AbstractService<Template, Long> {

    /**
     * 分页查询
     *
     * @param vo
     * @return
     */
    PageInfo<Template> findPageBreakByCondition(TemplateConditionVO vo);

    /**
     * 通过key获取模板信息
     *
     * @param key
     * @return
     */
    Template getTemplate(TemplateKeyEnum key);

    /**
     * 通过key获取模板信息
     *
     * @param key
     * @return
     */
    Template getTemplate(String key);
}
