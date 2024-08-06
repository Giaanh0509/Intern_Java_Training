package com.example.springcore.autowiring.notautowiring;
import com.example.springcore.autowiring.notautowiring.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:notautowiring/applicationContext.xml")
public class SpringCoreApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringCoreApplication.class, args);
        Student student = context.getBean("student", Student.class);
        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getAddress());
    }
}
