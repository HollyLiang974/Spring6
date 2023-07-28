package com.hzaucoi.spring6.iocxml.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestArrayDi {
    @Test
    public void testArrayDi() {
        ApplicationContext context=new ClassPathXmlApplicationContext("array-di.xml");
        Student student = (Student)context.getBean("studentFour", Student.class);
          System.out.println(student.toString());

    }
}
