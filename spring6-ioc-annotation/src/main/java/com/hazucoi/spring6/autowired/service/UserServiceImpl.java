package com.hazucoi.spring6.autowired.service;

import com.hazucoi.spring6.autowired.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    @Qualifier("userDaoImpl")
    private UserDao userDao;
//    @Autowired
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

//    @Autowired

    @Override
    public void out() {
        userDao.print();
        System.out.println("Service层执行结束");
    }
}
