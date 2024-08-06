package com.example.springcore.dependencyinjection.configxml.service;
import com.example.springcore.dependencyinjection.configxml.message.MessageService;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("Email sent to " + receiver + " with Message=" + message);
    }
}
