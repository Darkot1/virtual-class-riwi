package com.riwi.virtual_class_management.services.impl;

import com.riwi.virtual_class_management.dtos.studentDTO.response.StudentBasicInfo;
import com.riwi.virtual_class_management.entities.Student;
import com.riwi.virtual_class_management.repositories.StudentRepository;
import com.riwi.virtual_class_management.services.interfaces.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentImpl implements IStudentService {

    @Autowired
    StudentRepository studentRepository;


    @Override
    public Student archive(Long id) {
        Student student = readById(id);
        student.setActive(false);
        return studentRepository.save(student);
    }

    @Override
    public Student create(Student student) {
        return null;
    }

    @Override
    public List<StudentBasicInfo> readAll() {
        List<Student> activeStudents = studentRepository.findByActiveTrue();
        return activeStudents.stream().map(
                student -> new StudentBasicInfo(
                        student.getName(),
                        student.getEmail(),
                        student.getClasses().stream()
                                .map(c -> c.getName())
                                .collect(Collectors.toList())
                ))
                .collect(Collectors.toList());
    }

    @Override
    public Student readById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));

    }

    @Override
    public StudentBasicInfo save(StudentBasicInfo studentBasicInfo) {
        Student student = new Student();
        student.setName(studentBasicInfo.getName());
        student.setEmail(studentBasicInfo.getEmail());
        student.setActive(true); // Establece el estado por defecto
        // aca se asignan los ID de las clases

        Student savedStudent = studentRepository.save(student);
        return StudentBasicInfo.builder()
                .name(savedStudent.getName())
                .email(savedStudent.getEmail())
                .classes(savedStudent.getClasses().stream()
                        .map(c -> c.getName()) // se cambia segun lo que se quiera mostrar de`Class`
                        .collect(Collectors.toList()))
                .build();
    }


}
