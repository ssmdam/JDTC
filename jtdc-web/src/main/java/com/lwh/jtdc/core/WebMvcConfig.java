package com.lwh.jtdc.core;

import com.lwh.jtdc.core.intercepter.BraumIntercepter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Chris luo 201635020423

 * @since 1.8
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    BraumIntercepter braumIntercepter;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(braumIntercepter)
                .excludePathPatterns("/assets/**", "/error/**", "favicon.ico", "/css/**", "/js/**", "/img/**")
                .addPathPatterns("/**");
    }
}
