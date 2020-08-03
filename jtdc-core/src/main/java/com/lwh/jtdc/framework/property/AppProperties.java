package com.lwh.jtdc.framework.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Chris luo 201635020423
 * @since 1.0
 */
@Component
@ConfigurationProperties(prefix = "app")
@Data
public class AppProperties {

    /**
     * 是否启用验证码
     */
    public boolean enableKaptcha = true;

}
