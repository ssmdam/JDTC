package com.lwh.jtdc.persistence.beans;

import com.lwh.jtdc.framework.object.AbstractDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author yadong.zhang email:yadong.zhang0415(a)gmail.com
 * @version 1.0
2018/01/09 17:36
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SysLog extends AbstractDO {
	private Long userId;
	private String logLevel;
	private String ip;
	private String content;
	private String params;
	private String type;
	private String ua;
	private String os;
	private String browser;
	private String spiderType;
	private String requestUrl;
	private String referer;
}
