package com.lwh.jtdc.framework.property;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;

/**
 * redis属性配置文件
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
@Component
@ConfigurationProperties(prefix = "spring.redis")
@Data
@EqualsAndHashCode(callSuper = false)
@Order(-1)
public class RedisProperties {
    private Integer database;
    private String host;
    private Integer port;
    private String password;
    private Duration timeout;
    /**
     * 默认30天 = 2592000s
     */
    private Integer expire = 2592000;
}
