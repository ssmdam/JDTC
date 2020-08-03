package com.lwh.jtdc.persistence.beans;

import com.lwh.jtdc.framework.object.AbstractDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @website https://www.zhyd.me
 * @version 1.0
2018/4/16 16:26
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SysLink extends AbstractDO {
    private String url;
    private String name;
    private String description;
    private String email;
    private String qq;
    private String favicon;
    private Boolean status;
    private Boolean homePageDisplay;
    private String remark;
    private String source;
}
