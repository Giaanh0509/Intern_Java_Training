package com.example.springcore.aop.configxml.aspect;

public class LoggingAspect {
    public void logBeforeMethod() {
        System.out.println("A method in service package is called");
    }
}
