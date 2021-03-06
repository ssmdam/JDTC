package com.lwh.jtdc.framework.property;

import lombok.Data;
import lombok.EqualsAndHashCode;
import me.zhyd.oauth.config.AuthConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Chris luo 201635020423
 * @since 1.8
 */
@Component
@ConfigurationProperties(prefix = "me.zhyd.oauth")
@Data
@EqualsAndHashCode(callSuper = false)
@Order(-1)
public class JustAuthProperties {

    private AuthConfig gitee;
    private AuthConfig github;
    private AuthConfig weibo;
    private AuthConfig dingtalk;
    private AuthConfig baidu;
    private AuthConfig coding;
    private AuthConfig tencentCloud;
    private AuthConfig oschina;
    private AuthConfig alipay;
    private AuthConfig qq;
    private AuthConfig wechat;
    private AuthConfig taobao;
    private AuthConfig google;
    private AuthConfig facebook;
    private AuthConfig csdn;

    private AuthConfig douyin;
    private AuthConfig linkedin;
    private AuthConfig microsoft;
    private AuthConfig mi;
    private AuthConfig toutiao;
    private AuthConfig teambition;
    private AuthConfig renren;
    private AuthConfig pinterest;
    private AuthConfig stackoverflow;
    private AuthConfig huawei;
    private AuthConfig wechatEnterprise;
}
