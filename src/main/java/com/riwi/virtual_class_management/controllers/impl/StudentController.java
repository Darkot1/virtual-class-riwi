package com.riwi.virtual_class_management.controllers.impl;

import com.riwi.virtual_class_management.dtos.studentDTO.response.StudentBasicInfo;
import com.riwi.virtual_class_management.entities.Student;
import com.riwi.virtual_class_management.services.interfaces.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @GetMapping("/students")
    public List<StudentBasicInfo> getAllStudents() {
        return studentService.readAll();
    }

    @PostMapping("/students")
    public ResponseEntity<StudentBasicInfo> createStudent(@RequestBody StudentBasicInfo studentBasicInfo) {
        StudentBasicInfo createdStudent = studentService.save(studentBasicInfo);
        return new ResponseEntity<>(createdStudent, HttpStatus.CREATED);
    }


}
