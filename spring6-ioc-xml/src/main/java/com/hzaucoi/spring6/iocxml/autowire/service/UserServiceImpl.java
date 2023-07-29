package com.hzaucoi.spring6.iocxml.autowire.service;

import com.hzaucoi.spring6.iocxml.autowire.dao.UserDao;

public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        userDao.saveUser();
    }

}

