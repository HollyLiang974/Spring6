package com.hzaucoi.spring6.iocxml.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
    @Test
    public void testDiByset(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-di.xml");
        Student studentOne = context.getBean("studentOne", Student.class);
        System.out.println(studentOne);
    }
    @Test
    public void testDiByConstructor(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-di.xml");
        Student studentTwo = context.getBean("studentTwo", Student.class);
        System.out.println(studentTwo);
    }
}
