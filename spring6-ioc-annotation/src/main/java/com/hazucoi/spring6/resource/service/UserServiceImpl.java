package com.hazucoi.spring6.resource.service;

import com.hazucoi.spring6.resource.dao.UserDao;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.parallel.ResourceLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value = "myUserService")
public class UserServiceImpl implements UserService {
    @Resource(name="myUserDao")
    private UserDao userDao;
    @Override
    public void out() {
        userDao.print();
        System.out.println("Service层执行结束");
    }
}
