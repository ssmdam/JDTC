package com.lwh.jtdc.business.vo;

import com.lwh.jtdc.business.entity.Tags;
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
public class TagsConditionVO extends BaseConditionVO {
	private Tags tags;
}

