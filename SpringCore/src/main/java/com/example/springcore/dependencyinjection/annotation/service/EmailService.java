package com.example.springcore.dependencyinjection.annotation.service;

import com.example.springcore.dependencyinjection.annotation.message.MessageService;
import com.example.springcore.dependencyinjection.annotation.message.MessageService;
import org.springframework.stereotype.Service;

@Service("emailService")
public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("Email sent to " + receiver + " with Message=" + message);
    }
}
