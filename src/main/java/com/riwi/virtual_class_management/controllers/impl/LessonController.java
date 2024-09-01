package com.riwi.virtual_class_management.controllers.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riwi.virtual_class_management.entities.Lesson;
import com.riwi.virtual_class_management.services.interfaces.ILessonService;

@RestController
@RequestMapping("/lessons")
public class LessonController {

    @Autowired
    private ILessonService lessonService;

    @GetMapping
    public List<Lesson> getAllLessons() {
        return lessonService.readAll();
    }

    @GetMapping("/{id}")
    public Lesson getLessonById(@PathVariable Long id) {
        return lessonService.readById(id);
    }

    @PostMapping
    public Lesson createLesson(@RequestBody Lesson lesson) {
        return lessonService.create(lesson);
    }

    @PutMapping("/{id}")
    public Lesson updateLesson(@PathVariable Long id, @RequestBody Lesson lesson) {
        lesson.setId(id);
        return lessonService.save(lesson);
    }

    @DeleteMapping("/{id}")
    public void deleteLesson(@PathVariable Long id) {
        lessonService.destroy(id);
    }

    @PatchMapping("/lessons/{id}/disable")
public ResponseEntity<Lesson> disableLesson(@PathVariable Long id) {
    try {
        Lesson disabledLesson = lessonService.disableLesson(id);
        return new ResponseEntity<>(disabledLesson, HttpStatus.OK);
    } catch (Exception e) {
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
}