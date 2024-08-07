package com.example.springcore.transation.annotation.dao;
import com.example.springcore.transation.annotation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
