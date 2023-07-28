package com.hzaucoi.spring6.iocxml.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPDi {
    @Test
    //测试P命名空间
    public void testPDi() {
        //1.创建spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("p-di.xml");
        //2.从容器中获取bean
        Student student = (Student) context.getBean("studentSix", Student.class);
        //3.调用方法
        System.out.println(student.toString());
    }
}
