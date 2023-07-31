package com.hazucoi.spring6.controller;

import com.hazucoi.spring6.dao.UserDaoImpl;
import com.hazucoi.spring6.service.UserService;
import com.hazucoi.spring6.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
//    @Autowired
    private UserService userService;
//    @Autowired
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }

//    @Autowired
    public UserController(@Autowired UserService userService) {
        this.userService = userService;
    }

    public void out(){
        userService.out();
        System.out.println("Controller层执行结束");
    }
}
