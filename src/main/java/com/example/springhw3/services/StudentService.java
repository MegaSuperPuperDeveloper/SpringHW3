package com.example.springhw3.services;

import com.example.springhw3.models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService implements iService {

    private final List<Student> students = new ArrayList<>();

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getById(int id) {
        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void add(Object o) {
        students.add((Student) o);
    }

    @Override
    public void deleteById(long id) {
        students.removeIf(student -> student.getId() == id);
    }
}