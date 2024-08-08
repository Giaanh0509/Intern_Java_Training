package com.example.springcore.autowiring.notautowiring.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    private int id;
    private String name;
    private int age;

    @Autowired
    private Address address;

    @Autowired
    public Student(Address address) {
        this.address = address;
    }

    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    public Student() {
    }

    public Student(int id, String name, int age, Address address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

}
