package com.example.springcore.aop.controller;
import com.example.springcore.aop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aop")
public class UserControlleer {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public String getUser() {
        userService.getUser();
        return "User fetched";
    }
}
