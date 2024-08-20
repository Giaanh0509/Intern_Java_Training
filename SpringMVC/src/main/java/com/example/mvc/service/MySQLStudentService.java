package com.example.mvc.service;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mvc.dao.StudentRepository;
import com.example.mvc.model.Student;

import java.util.List;

@Service
@Transactional
public class MySQLStudentService implements StudentService{
//    private StudentDAO studentDAO;
    private StudentRepository studentRepository;

    @Autowired
    public MySQLStudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> getStudentByFirstName(String firstName) {
        return studentRepository.findByFirstName(firstName);
    }

    @Override
    public Student getByID(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    @Transactional
    public void updateStudent(Student student) {
        studentRepository.updateStudent(student.getId(), student.getLastName(), student.getFirstName(), student.getEmail());
    }

    @Override
    public void deleteById(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> getAllStudentNotFirstName(String firstName) {
        return studentRepository.findByFirstNameNot(firstName);
    }
}
