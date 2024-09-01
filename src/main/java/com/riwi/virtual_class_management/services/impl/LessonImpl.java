package com.riwi.virtual_class_management.services.impl;

import com.riwi.virtual_class_management.entities.Lesson;
import com.riwi.virtual_class_management.repositories.LessonRepository;
import com.riwi.virtual_class_management.services.interfaces.ILessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonImpl implements ILessonService {

    @Autowired
    private LessonRepository lessonRepository;

    @Override
    public Lesson archive(Long aLong) {

        return null;
    }

    @Override
    public Lesson create(Lesson lesson) {
        return null;
    }

    @Override
    public List<Lesson> readAll() {
        return List.of();
    }

    @Override
    public Lesson readById(Long aLong) {
        return null;
    }

    @Override
    public Lesson save(Lesson lesson) {
        return null;
    }
}
