package com.hzaucoi.spring6;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    @Test
    public void testAdd() {
        // 1. 加载spring配置文件，根据创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 2. 得到配置创建的对象
        User user = (User) context.getBean("user");
        // 3. 调用方法
        user.add();
    }
}
