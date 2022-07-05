package com.xd.conf;

import com.xd.web.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * WebMvcConfigurer有很多mvc的功能
 */
@Configuration
public class MyAppConfig implements WebMvcConfigurer {

    @Bean
    public LoginInterceptor loginInterceptor(){
        return new LoginInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        String[] path = {"/user/**"};
        String[] excludePath = {"/user/login"};
        registry.addInterceptor(loginInterceptor()).addPathPatterns(path).excludePathPatterns(excludePath);
    }
}
