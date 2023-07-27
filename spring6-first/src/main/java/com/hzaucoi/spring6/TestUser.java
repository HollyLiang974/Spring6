package com.hzaucoi.spring6;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.slf4j.Logger;
public class TestUser {
    //创建日志对象
    private Logger logger = LoggerFactory.getLogger(TestUser.class);
    @Test
    public void testAdd() {
        // 1. 加载spring配置文件，根据创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 2. 得到配置创建的对象
        User user = (User) context.getBean("user");
        // 3. 调用方法
        user.add();
        // 打印自定义日志
        logger.info("执行成功");
    }
}
