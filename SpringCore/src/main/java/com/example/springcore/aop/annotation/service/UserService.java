package com.example.springcore.aop.annotation.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void getUser() {
        System.out.println("Executing getUser method");
    }
}
