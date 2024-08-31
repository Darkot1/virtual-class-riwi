package com.riwi.virtual_class_management.controllers.impl;

import com.riwi.virtual_class_management.entities.Student;
import com.riwi.virtual_class_management.services.interfaces.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.readAll();
    }



}
