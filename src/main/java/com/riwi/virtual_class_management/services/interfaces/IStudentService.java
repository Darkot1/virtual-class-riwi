package com.riwi.virtual_class_management.services.interfaces;

import com.riwi.virtual_class_management.entities.Student;
import com.riwi.virtual_class_management.services.CRUD.*;

public interface IStudentService extends
        Save<Student>,
        Create<Student, Student>,
        ReadById<Student, Long>,
        ReadAll<Student>,
        Archive<Long> {
}
