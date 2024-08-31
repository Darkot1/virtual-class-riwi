package com.riwi.virtual_class_management.services.CRUD;

public interface ReadById <Entity,ID>{
    public Entity readById(ID id);
}
