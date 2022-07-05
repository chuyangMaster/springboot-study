package com.xd;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootCommandlinerunnerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        System.out.println("容器创建");
        SpringApplication.run(SpringbootCommandlinerunnerApplication.class, args);
        System.out.println("容器创建完成");
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("容器创建赋值后执行run方法，在该方法中可以：读取文件、访问数据库等操作");
    }
}
