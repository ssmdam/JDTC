package com.lwh.jtdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 程序启动类
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
@SpringBootApplication
@ServletComponentScan
public class JtdcAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(JtdcAdminApplication.class, args);
    }
}
