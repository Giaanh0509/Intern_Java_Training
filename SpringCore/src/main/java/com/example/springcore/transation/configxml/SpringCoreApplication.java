package com.example.springcore.transation.configxml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:transation/applicationContext.xml")
public class SpringCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCoreApplication.class, args);
    }
}
