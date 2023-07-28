package com.hzaucoi.spring6.iocxml.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMapDi {
    @Test
    // 为Map集合类型属性赋值
    public void testMapDi() {
        ApplicationContext context = new ClassPathXmlApplicationContext("map-di.xml");
        Student student = (Student) context.getBean("studentFour", Student.class);
        System.out.println(student.toString());
    }
}
