package com.riwi.virtual_class_management.services.CRUD;

public interface Create<EntityRequest, Entity>{
    public Entity create(EntityRequest request);
}
