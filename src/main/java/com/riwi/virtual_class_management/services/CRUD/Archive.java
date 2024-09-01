package com.riwi.virtual_class_management.services.CRUD;

import javax.swing.text.html.parser.Entity;

public interface Archive<Entity,ID>{
    public Entity archive(ID id);
}
