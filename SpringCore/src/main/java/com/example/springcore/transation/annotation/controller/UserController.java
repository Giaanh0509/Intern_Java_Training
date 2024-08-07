package com.example.springcore.transation.annotation.controller;

import com.example.springcore.transation.annotation.entity.User;
import com.example.springcore.transation.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public List<User> getAllStudents() {
        return this.userService.getAll();
    }

    @PostMapping("")
    public ResponseEntity<User> addStudent(@RequestBody User user) {
        user = userService.addUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
