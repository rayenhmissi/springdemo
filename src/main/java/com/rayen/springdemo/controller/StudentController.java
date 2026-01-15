package com.rayen.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rayen.springdemo.model.Student;
import com.rayen.springdemo.service.StudentService;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    
    @GetMapping
    public List<Student> findAllStudents() {
        return studentService.findAllStudents();
    }
}