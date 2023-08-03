package com.hazucoi.spring6.bean;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

//两种方式均可
//方式一
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:bean.xml")
//方式二
//@SpringJUnitConfig(locations = "classpath:bean.xml")
public class TestUserJunit5 {
    @Autowired
    private User user;
    @Test
    public void testUser(){
        System.out.println(user);
    }
}
