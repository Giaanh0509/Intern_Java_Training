package com.example.springcore.dependencyinjection.annotation.service;

import com.example.springcore.dependencyinjection.annotation.message.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    private final MessageService messageService;

    @Autowired
    public NotificationService(@Qualifier("emailService") MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendNotification(String message, String receiver) {
        messageService.sendMessage(message, receiver);
    }
}
