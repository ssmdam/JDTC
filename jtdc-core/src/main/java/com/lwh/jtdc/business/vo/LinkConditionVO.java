package com.lwh.jtdc.business.vo;

import com.lwh.jtdc.business.entity.Link;
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
public class LinkConditionVO extends BaseConditionVO {
	private Link link;
	private Integer status;
	private Integer homePageDisplay;

	public LinkConditionVO() {
	}

	public LinkConditionVO(Integer status, Integer homePageDisplay) {
		this.status = status;
		this.homePageDisplay = homePageDisplay;
	}
}

