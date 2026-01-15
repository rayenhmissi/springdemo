package com.rayen.springdemo.service;

import java.util.List;

import com.rayen.springdemo.model.Student;

public interface StudentService {
    Student save(Student S);
    List<Student> findAllStudents();
    Student findById(Long id);
    boolean deleteById(Long id);
}
