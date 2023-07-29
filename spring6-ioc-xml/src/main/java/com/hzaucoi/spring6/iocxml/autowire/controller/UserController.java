package com.hzaucoi.spring6.iocxml.autowire.controller;

import com.hzaucoi.spring6.iocxml.autowire.service.UserService;

public class UserController {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser(){
        userService.saveUser();
    }
}
