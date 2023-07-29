package com.hzaucoi.spring6.iocxml.autowire.dao;

public class UserDaoImpl implements UserDao{

    @Override
    public void saveUser() {
        System.out.println("UserDaoImpl.saveUser()");
    }
}
