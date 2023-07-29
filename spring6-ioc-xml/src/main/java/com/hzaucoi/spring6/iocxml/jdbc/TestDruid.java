package com.hzaucoi.spring6.iocxml.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDruid {
    @Test
    public void testDruid() {
        ApplicationContext context =new ClassPathXmlApplicationContext("jdbc-di.xml");
        DruidDataSource dataSource = context.getBean("druidDataSource", DruidDataSource.class);
        System.out.println(dataSource.getUrl());
    }
}
