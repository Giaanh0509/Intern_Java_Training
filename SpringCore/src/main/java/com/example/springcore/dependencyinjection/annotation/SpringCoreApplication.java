package com.example.springcore.dependencyinjection.annotation;
import com.example.springcore.dependencyinjection.annotation.service.NotificationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringCoreApplication.class, args);
        NotificationService notificationService = context.getBean(NotificationService.class);

        notificationService.sendNotification("Hi there!", "example@example.com");
    }
}
