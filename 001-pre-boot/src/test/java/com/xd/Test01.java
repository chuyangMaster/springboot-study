package com.xd;

import com.xd.conf.SpringConf;
import com.xd.domain.Student;
import com.xd.vo.Targer;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConf.class);

    public void print(){
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }

    @Test
    public void testForXml(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student myStudent = (Student) applicationContext.getBean("myStudent");
        System.out.println(myStudent);
    }

    @Test
    public void testForConf(){
        print();


//        Student myStudent = applicationContext.getBean("myStudent", Student.class);
//        System.out.println(myStudent);
//
//        Targer targer = applicationContext.getBean("targer", Targer.class);
//        System.out.println(targer);
    }
}
