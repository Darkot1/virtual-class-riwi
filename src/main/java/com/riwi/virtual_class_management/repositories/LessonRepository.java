package com.riwi.virtual_class_management.repositories;

import com.riwi.virtual_class_management.entities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
