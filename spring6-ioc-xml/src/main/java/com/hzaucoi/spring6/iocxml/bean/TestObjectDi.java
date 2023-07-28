package com.hzaucoi.spring6.iocxml.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestObjectDi {
    @Test
    //测试引用外部bean
    public void testObjectDi() {
        ApplicationContext context = new ClassPathXmlApplicationContext("object-di.xml");
        Student student = (Student) context.getBean("studentFour", Student.class);
        System.out.println(student.toString());

    }
}
