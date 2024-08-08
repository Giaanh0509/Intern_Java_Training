package com.example.mvc.dao;

import com.example.mvc.entity.Student;

import java.util.List;

public interface StudentDAO {
    public List<Student> getAll();

    public Student getByID(int id);

    public Student addStudent(Student student);

    public Student updateStudent(Student student);

    public void deleteById(int id);
}
