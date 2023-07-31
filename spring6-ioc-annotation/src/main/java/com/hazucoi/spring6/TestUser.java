package com.hazucoi.spring6;

import com.hazucoi.spring6.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    @Test
    //属性注入
    // 在每层的属性上加@AutoWire注解，无需set方法
    public void testUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserController controller = context.getBean("userController",UserController.class);
        controller.out();
        System.out.println("执行结束");

    }
    @Test
    //set注入，在set方法上添加@Autowire注解
    public void testUser1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserController controller = context.getBean("userController",UserController.class);
        controller.out();
        System.out.println("执行结束");
    }

}
