package com.riwi.virtual_class_management.services.interfaces;

import com.riwi.virtual_class_management.services.CRUD.*;

public interface IClassService extends
        Save<Class>,
        Archive<Class,Long>,
        Create<Class, Class>,
        ReadAll<Class>,
        ReadById<Class, Long>{
}
