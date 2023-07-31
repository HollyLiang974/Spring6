package com.hazucoi.spring6.test.service.impl;

import com.hazucoi.spring6.core.annotation.Bean;
import com.hazucoi.spring6.test.service.UserService;
@Bean
public class UserServiceImpl implements UserService {
    @Override
    public void out() {
        System.out.println("Service层执行结束");
    }
}
