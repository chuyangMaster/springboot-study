package com.xd.conf;

import com.xd.domain.Car;
import com.xd.domain.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public Car car(){
        return new Car("BYD", "red");
    }

    //@ConditionalOnMissingBean(name = "car")
    @Bean
    public User user(){
        User user = new User("张三", 110);
        user.setCar(car());
        return user;
    }
}
