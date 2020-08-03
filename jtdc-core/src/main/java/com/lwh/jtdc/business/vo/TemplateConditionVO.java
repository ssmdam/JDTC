package com.lwh.jtdc.business.vo;

import com.lwh.jtdc.business.entity.Template;
import com.lwh.jtdc.framework.object.BaseConditionVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TemplateConditionVO extends BaseConditionVO {
	private Template template;
}

