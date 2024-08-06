package com.example.springcore.dependencyinjection.configxml;
import com.example.springcore.dependencyinjection.configxml.service.NotificationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class SpringCoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringCoreApplication.class, args);
        NotificationService notificationService = context.getBean("notificationService", NotificationService.class);
        notificationService.sendNotification("Hi there!", "example@example.com");
    }

}
