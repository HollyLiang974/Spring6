package com.hazucoi.spring6.test.dao.impl;

import com.hazucoi.spring6.core.annotation.Bean;
import com.hazucoi.spring6.test.dao.UserDao;
@Bean
public class UserDaoImpl implements UserDao {
    @Override
    public void print() {
        System.out.println("Dao层执行结束");
    }
}
