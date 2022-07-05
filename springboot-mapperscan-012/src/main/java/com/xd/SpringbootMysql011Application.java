package com.xd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"com.xd.dao"})
@SpringBootApplication
public class SpringbootMysql011Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMysql011Application.class, args);
    }

}
