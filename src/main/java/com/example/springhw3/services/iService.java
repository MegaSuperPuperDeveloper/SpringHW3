package com.example.springhw3.services;

import com.example.springhw3.models.Student;

import java.util.List;

public interface iService<T> {
    List<T> getAllStudents();
    T getById(int id);
    void add(T s);
    void deleteById(long id);
}