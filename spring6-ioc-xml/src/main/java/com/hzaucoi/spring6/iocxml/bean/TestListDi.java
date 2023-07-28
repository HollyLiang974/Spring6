package com.hzaucoi.spring6.iocxml.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestListDi {
    @Test
    //为List集合类型属性赋值
    public void testListDi() {
        ApplicationContext context = new ClassPathXmlApplicationContext("list-di.xml");
        Clazz clazz = (Clazz) context.getBean("clazzTwo", Clazz.class);
        Student student = (Student) context.getBean("studentOne", Student.class);
        System.out.println(student.toString());
        System.out.println(clazz.getStudents());

    }
}
