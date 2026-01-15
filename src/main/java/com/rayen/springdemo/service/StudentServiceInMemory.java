package com.rayen.springdemo.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rayen.springdemo.model.Student;
@Service
public class StudentServiceInMemory  implements StudentService {
     public List<Student> findAllStudents() {
        Student student1 = new Student("Rayen", "Hmissi", new Date(2004, 4, 20), "rayen.hmissi@example.com", "1234567890");
        return List.of(student1);
    }

     @Override
     public Student save(Student S) {
        return null;
     }

     @Override
     public Student findById(Long id) {
        return null;
     }

     @Override
     public boolean deleteById(Long id) {
        return false;
     }
}
