package com.riwi.virtual_class_management.repositories;

import com.riwi.virtual_class_management.entities.Class;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<Class, Long> {
}
