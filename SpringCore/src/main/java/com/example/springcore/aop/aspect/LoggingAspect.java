package com.example.springcore.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.example.springcore.aop.service.*.*(..))")
    public void logBeforeMethod() {
        System.out.println("A method in service package is called");
    }
}
