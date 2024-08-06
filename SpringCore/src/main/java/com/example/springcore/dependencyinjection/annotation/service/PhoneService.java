package com.example.springcore.dependencyinjection.annotation.service;
import com.example.springcore.dependencyinjection.annotation.message.MessageService;
import org.springframework.stereotype.Service;

@Service("phoneService")
public class PhoneService implements MessageService {
    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("Phone sent to " + receiver + " with Message=" + message);
    }
}
