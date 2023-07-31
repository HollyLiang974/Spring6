package com.hazucoi.spring6.config;

import com.hazucoi.spring6.autowired.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testAllAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Spring6Config.class);
        UserController controller =context.getBean("userController",UserController.class);
        controller.out();
        System.out.println("执行结束！");
    }


}
