package com.lwh.jtdc.framework.property;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Chris luo 201635020423
 * @since 1.0
 */
@Component
@ConfigurationProperties(prefix = "app.shiro")
@Data
@EqualsAndHashCode(callSuper = false)
@Order(-1)
public class ShiroProperties {

    public String loginUrl = "/passport/login/";
    public String successUrl = "/";
    public String unauthorizedUrl = "/error/403";


}
