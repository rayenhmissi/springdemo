package com.rayen.springdemo.student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import com.rayen.springdemo.model.Student;

public class InMemoryStudentDao {
    public final List<Student> students = new ArrayList<>();
    public Student save(Student s) {
        students.add(s);
        return s;
    } 
    public Student findByEmail(String email) {
        return students.stream().filter(s-> email.equals(s.getEmail())).findFirst().orElse(null);
    }
    public void delete(String email){
        var student = findByEmail(email);
        if (student != null){
            students.remove(student);
        }
    }
    public Student update(Student s){
        int student_index=IntStream.range(0,students.size()).filter(i-> students.get(i).getEmail().equals(s.getEmail())).findFirst().orElse(-1);
        if (student_index != -1){
           students.set(student_index, s);
           return s;
        }
        return null;
    }
}
