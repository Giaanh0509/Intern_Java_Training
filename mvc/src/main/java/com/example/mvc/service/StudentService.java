package com.example.mvc.service;

import com.example.mvc.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAll();

    public Student getByID(int id);

    public Student addStudent(Student student);

    public void updateStudent(Student student);

    public void deleteById(int id);

    List<Student> getAllStudentNotFirstName(String firstName);
}
