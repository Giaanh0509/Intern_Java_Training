package com.example.springcore.transation.configxml.service;
import com.example.springcore.transation.configxml.dao.UserRepository;
import com.example.springcore.transation.configxml.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MySqlUserService implements UserService {
    private UserRepository userRepository;

    @Autowired
    public MySqlUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
       return userRepository.findAll();
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }
}
