package com.hzaucoi.spring6.iocxml.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserDao {
    public static void main(String[] args) {
        // 1. 加载spring配置文件，根据创建对象
         ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 2.1 根据ID和类型得到配置创建的对象
        // 当根据类型获取bean时，要求IOC容器中指定类型的bean有且只能有一个
        UserDao userDao = context.getBean("userDaoImpl",UserDao.class);
        userDao.run();


    }
}
