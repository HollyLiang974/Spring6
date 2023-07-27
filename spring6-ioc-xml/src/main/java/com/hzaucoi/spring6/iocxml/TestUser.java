package com.hzaucoi.spring6.iocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        // 1. 加载spring配置文件，根据创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 2.1 根据id得到配置创建的对象
        User user1 = (User) context.getBean("user");
        System.out.println("根据id获取bean:" + user1);
        // 2.2 根据类型得到配置创建的对象
        User user2 = context.getBean(User.class);
        System.out.println("根据类型获取bean:" + user2);
        //2.3 根据id和类型得到配置创建的对象
        User user3 = context.getBean("user", User.class);
        System.out.println("根据id和类型获取bean:" + user3);
    }
}
