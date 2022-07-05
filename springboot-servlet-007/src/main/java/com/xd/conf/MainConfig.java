package com.xd.conf;

import com.xd.web.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {

    @Bean
    public ServletRegistrationBean servletRegistrationBean(){

        //第一种方式，使用无参构造
//        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
//        servletRegistrationBean.setServlet(new MyServlet());
//        servletRegistrationBean.addUrlMappings("/login", "/test");

        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new MyServlet(), "/helloservlet");
        return servletRegistrationBean;
    }
}
