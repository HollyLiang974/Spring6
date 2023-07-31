package com.hazucoi.spring6.autowired;

import com.hazucoi.spring6.autowired.controller.UserController;
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
    @Test
    //构造方法注入，在构造方法上添加@Autowire注解
    public void testUser2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserController controller = context.getBean("userController",UserController.class);
        controller.out();
        System.out.println("执行结束");
    }

    @Test
    //形参注入，在构造方法形参上上添加@Autowire注解
    public void testUser3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserController controller = context.getBean("userController",UserController.class);
        controller.out();
        System.out.println("执行结束");
    }
    @Test
    //只有一个构造函数，无注解
    public void testUser4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserController controller = context.getBean("userController",UserController.class);
        controller.out();
        System.out.println("执行结束");
    }
}
