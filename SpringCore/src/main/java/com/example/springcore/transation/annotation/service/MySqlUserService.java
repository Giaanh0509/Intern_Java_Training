package com.example.springcore.transation.annotation.service;
import com.example.springcore.transation.annotation.dao.UserRepository;
import com.example.springcore.transation.annotation.entity.User;
import jakarta.transaction.Transactional;
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

    @Transactional
    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Transactional
    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }
}
