package com.hazucoi.spring6.autowired.controller;

import com.hazucoi.spring6.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
//    @Autowired
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }

//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }

    public void out(){
        userService.out();
        System.out.println("Controller层执行结束");
    }
}
