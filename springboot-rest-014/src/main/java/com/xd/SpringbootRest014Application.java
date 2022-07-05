package com.xd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.xd.dao")
public class SpringbootRest014Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRest014Application.class, args);
    }

}
