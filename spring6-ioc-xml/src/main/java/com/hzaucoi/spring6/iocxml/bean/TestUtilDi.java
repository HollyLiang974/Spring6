package com.hzaucoi.spring6.iocxml.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUtilDi {
    @Test
    //测试引用集合类型的bean
    public void testUtilDi() {
        //1.创建spring容器
        ApplicationContext context= new ClassPathXmlApplicationContext("util-di.xml");
        //2.从容器中获取bean
        Student student = (Student) context.getBean("studentFour", Student.class);

        //3.调用方法
        System.out.println(student.toString());
    }
}
