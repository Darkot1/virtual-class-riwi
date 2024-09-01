package com.riwi.virtual_class_management.services.impl;

import com.riwi.virtual_class_management.repositories.ClassRepository;
import com.riwi.virtual_class_management.services.interfaces.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassImpl implements IClassService {

    @Autowired
    private ClassRepository classRepository;

    @Override
    public Class archive(Long aLong) {

        return null;
    }

    @Override
    public Class create(Class aClass) {

        return null;
    }

    @Override
    public List<Class> readAll() {
        return List.of();
    }

    @Override
    public Class readById(Long aLong) {
        return null;
    }

    @Override
    public Class save(Class aClass) {
        return null;
    }
}
