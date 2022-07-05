package com.xd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @EnableTransactionManagement：开始springboot的事务管理器
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "com.xd.dao")
public class SpringbootTransaction013Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTransaction013Application.class, args);
    }

}
