package com.example.springcore.dependencyinjection.configxml.service;
import com.example.springcore.dependencyinjection.configxml.message.MessageService;

public class NotificationService {
    private final MessageService messageService;

    public NotificationService( MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendNotification(String message, String receiver) {
        messageService.sendMessage(message, receiver);
    }
}
