package com.example.springcore.transation.configxml.service;

import com.example.springcore.transation.configxml.entity.User;
import java.util.List;

public interface UserService {
    public List<User> getAll();

    public User addUser(User user);
}
