package com.hzaucoi.spring6.iocxml.autowire.controller;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWireByXML {
    @Test
    public void testAutoWireByXML(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("autowire-xml.xml");
        UserController userController = ac.getBean(UserController.class);
        userController.saveUser();
    }
}
