package com.example.springhw3.models;

import lombok.Data;

@Data
public class Student {
    private static long idCounter = 1L;

    private long id;
    private String name;
    private String lastName;

    public Student(String name, String lastName) {
        this.id = idCounter++;
        this.name = name;
        this.lastName = lastName;
    }

}