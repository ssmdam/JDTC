package com.lwh.jtdc.framework.config;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

/**
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
@Component
@MapperScan("com.lwh.jtdc.persistence.mapper")
public class MybatisConfig {
}
