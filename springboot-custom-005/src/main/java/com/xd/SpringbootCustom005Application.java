package com.xd;

import com.xd.domain.Car;
import com.xd.service.impl.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties(value = {Car.class})
public class SpringbootCustom005Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringbootCustom005Application.class, args);
        String[] beanNamesForType = run.getBeanNamesForType(Car.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }

        UserService userService = run.getBean("userService", UserService.class);
        userService.doSome("张三");
    }

}
