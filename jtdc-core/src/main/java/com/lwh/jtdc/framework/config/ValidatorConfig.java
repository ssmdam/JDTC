package com.lwh.jtdc.framework.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Chris luo 201635020423
 * @since 1.0
 */
@Configuration
@Order(0)
public class ValidatorConfig implements WebMvcConfigurer {

    @Override
    public Validator getValidator() {
        return new LocalValidatorFactoryBean();
    }

    @Override
    public MessageCodesResolver getMessageCodesResolver() {
        return null;
    }
}
