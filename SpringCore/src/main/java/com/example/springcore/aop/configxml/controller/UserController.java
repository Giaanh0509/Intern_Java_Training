package com.example.springcore.aop.configxml.controller;

import com.example.springcore.aop.configxml.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/aop/xml")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public String getUser() {
        userService.getUser();
        return "User fetched";
    }
}
