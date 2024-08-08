package com.example.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.mvc.entity.Student;
import com.example.mvc.service.StudentService;
import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/list")
    public String listAllStudent(Model model) {
        List<Student> students = studentService.getAll();
        model.addAttribute("students", students);
        return "student/students";
    }

    @GetMapping("/create")
    public String create(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "/student/students-newcreate-form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("student") Student student) {
        studentService.addStudent(student);
        return "redirect:/students/list";
    }

    @GetMapping("/update")
    public String update(@RequestParam("id") Integer id, Model model) {
        Student student = studentService.getByID(id);
        model.addAttribute("student", student);
        return "/student/students-update-form";
    }

    @PutMapping("/saveupdate")
    public String saveUpdate(@ModelAttribute("student") Student student) {
        studentService.updateStudent(student);
        return "redirect:/students/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id, Model model) {
        studentService.deleteById(id);
        return "redirect:/students/list";
    }
}
