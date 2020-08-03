package com.lwh.jtdc.business.vo;

import com.lwh.jtdc.framework.object.BaseConditionVO;
import lombok.Getter;
import lombok.Setter;

/**
 * @author yadong.zhang email:yadong.zhang0415(a)gmail.com
 * @version 1.0
2018/01/09 17:40
 * @since 1.0
 */
@Getter
@Setter
public class LogConditionVO extends BaseConditionVO {
	private Long userId;
	private String logLevel;
	private String type;
	private Boolean spider;
}

