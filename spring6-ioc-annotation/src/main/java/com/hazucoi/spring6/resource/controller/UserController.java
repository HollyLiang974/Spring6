package com.hazucoi.spring6.resource.controller;

import com.hazucoi.spring6.resource.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller(value="myUserController")
public class UserController {
    @Resource(name="myUserService")
    private UserService userService;
    public void out(){
        userService.out();
        System.out.println("Controller层执行结束");
    }
}
