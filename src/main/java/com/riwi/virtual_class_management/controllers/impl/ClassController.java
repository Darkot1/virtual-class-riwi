package com.riwi.virtual_class_management.controllers.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riwi.virtual_class_management.services.interfaces.IClassService;

@RestController
@RequestMapping("/classes")
public class ClassController {

    @Autowired
    private IClassService classService;

    @SuppressWarnings("rawtypes")
    @GetMapping
    public List<Class> getAllClasses() {
        return classService.readAll();
    }

    @SuppressWarnings("rawtypes")
    @GetMapping("/{id}")
    public Class getClassById(@PathVariable Long id) {
        return classService.readById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteClass(@PathVariable Long id) {
        classService.destroy(id);
    }


}
