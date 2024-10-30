package com.example.springhw3.controllers;

import com.example.springhw3.models.Student;
import com.example.springhw3.services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class StudentController {

    private StudentService studentService;

    @GetMapping("/students")
    public String getStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "studentList.html";
    }

    @PostMapping("/addStudents")
    public String addStudent(Student student, Model model) {
        studentService.add(student);
        return getStudents(model);
    }

    @GetMapping("/delStudents")
    public String deleteStudent(long id, Model model) {
        studentService.deleteById(id);
        return getStudents(model);
    }

}