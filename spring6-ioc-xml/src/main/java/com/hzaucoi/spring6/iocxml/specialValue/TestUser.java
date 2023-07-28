package com.hzaucoi.spring6.iocxml.specialValue;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    @Test
    public void testSpecialValue(){
        ApplicationContext context = new ClassPathXmlApplicationContext("specialValue.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.toString());;
    }
}
