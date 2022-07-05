package com.xd;

import com.xd.domain.Car;
import com.xd.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootFirstApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringbootFirstApplication.class, args);
//        User user = run.getBean("user", User.class);
//        Car car = run.getBean("car", Car.class);
//        System.out.println(user);
//        System.out.println(car);
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }

}
