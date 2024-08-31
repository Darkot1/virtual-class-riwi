package com.riwi.virtual_class_management.services.impl;

import com.riwi.virtual_class_management.entities.Student;
import com.riwi.virtual_class_management.repositories.StudentRepository;
import com.riwi.virtual_class_management.services.interfaces.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentImpl implements IStudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void archive(Long aLong) {

    }

    @Override
    public Student create(Student student) {
        return null;
    }

    @Override
    public List<Student> readAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student readById(Long aLong) {
        return null;
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }
}
