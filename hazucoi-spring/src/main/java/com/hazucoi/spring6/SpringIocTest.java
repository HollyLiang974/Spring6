package com.hazucoi.spring6;

import com.hazucoi.spring6.core.AnnotationApplicationContext;
import com.hazucoi.spring6.core.ApplicationContext;
import com.hazucoi.spring6.test.service.UserService;
import org.junit.jupiter.api.Test;

public class SpringIocTest {
    @Test
    public void testIoC(){
        ApplicationContext context =new AnnotationApplicationContext("com.hazucoi.spring6.test");
        UserService userService =(UserService)context.getBean(UserService.class);
        userService.out();
        System.out.println("run success");
    }
}
