package com.hazucoi.spring6.test.service.impl;

import com.hazucoi.spring6.core.annotation.Bean;
import com.hazucoi.spring6.core.annotation.Di;
import com.hazucoi.spring6.test.dao.UserDao;
import com.hazucoi.spring6.test.service.UserService;
@Bean
public class UserServiceImpl implements UserService {
    @Di
    private UserDao userDao;
    @Override
    public void out() {
        userDao.print();
        System.out.println("Service层执行结束");
    }
}
