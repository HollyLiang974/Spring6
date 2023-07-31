package com.hazucoi.spring6.resource.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "myUserDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void print() {
        System.out.println("Dao层执行结束");
    }
}
