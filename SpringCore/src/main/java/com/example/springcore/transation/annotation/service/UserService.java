package com.example.springcore.transation.annotation.service;
import com.example.springcore.transation.annotation.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getAll();

    public User addUser(User user);
}
