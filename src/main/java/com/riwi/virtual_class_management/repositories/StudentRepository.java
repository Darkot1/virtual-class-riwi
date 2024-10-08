package com.riwi.virtual_class_management.repositories;

import com.riwi.virtual_class_management.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByActiveTrue();
}
