package com.example.springcore.transation.configxml.dao;
import com.example.springcore.transation.configxml.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
