package com.xd.vo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Targer {

    @Value("${tiger.name}")
    private String name;
    @Value("${tiger.age}")
    private Integer age;

    public Targer() {
    }

    public Targer(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Targer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
