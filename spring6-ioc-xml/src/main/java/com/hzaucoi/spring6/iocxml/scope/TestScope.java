package com.hzaucoi.spring6.iocxml.scope;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {
    @Test
    public void testSingleBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("scope-di.xml");
        User user1 = context.getBean("singleUser", User.class);
        User user2 = context.getBean("singleUser", User.class);
        System.out.println(user1 == user2);

    }
    @Test
    public void prototypeBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("scope-di.xml");
        User user1 = context.getBean("prototypeUser", User.class);
        User user2 = context.getBean("prototypeUser", User.class);
        System.out.println(user1 == user2);
    }
}
