package com.riwi.virtual_class_management.controllers.impl;

import com.riwi.virtual_class_management.dtos.studentDTO.response.StudentBasicInfo;
import com.riwi.virtual_class_management.entities.Student;
import com.riwi.virtual_class_management.services.interfaces.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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

    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.readById(id));
    }

    @PatchMapping("students/{id}/disable")
    public ResponseEntity<StudentBasicInfo> disableStudent(@PathVariable Long id) {
        Student disabledStudent = studentService.archive(id);

        // Convertir entidad Student
        StudentBasicInfo studentDTO = StudentBasicInfo.builder()
                .name(disabledStudent.getName())
                .email(disabledStudent.getEmail())
                .classes(disabledStudent.getClasses().stream()
                        .map(c -> c.getName()) // Cambia según el campo que quieras mostrar de `Class`
                        .collect(Collectors.toList()))
                .build();

        return ResponseEntity.ok(studentDTO);
    }
}
