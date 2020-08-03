package com.lwh.jtdc;

import me.zhyd.braum.spring.boot.annotation.EnableBraumConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 程序启动类
 *
 * @author Chris luo 201635020423

 * @since 1.0
 */
@SpringBootApplication
@ServletComponentScan
@EnableTransactionManagement
@EnableBraumConfiguration
public class JtdcWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(JtdcWebApplication.class, args);
    }

}
