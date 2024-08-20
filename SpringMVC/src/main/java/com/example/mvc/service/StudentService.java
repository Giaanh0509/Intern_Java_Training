package com.example.mvc.service;

import com.example.mvc.model.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAll();

    public List<Student> getStudentByFirstName(String firstName);

    public Student getByID(int id);

    public Student addStudent(Student student);

    public void updateStudent(Student student);

    public void deleteById(int id);

    List<Student> getAllStudentNotFirstName(String firstName);
}
