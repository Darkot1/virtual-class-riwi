package com.riwi.virtual_class_management.services.interfaces;

import com.riwi.virtual_class_management.dtos.studentDTO.response.StudentBasicInfo;
import com.riwi.virtual_class_management.entities.Student;
import com.riwi.virtual_class_management.services.CRUD.*;

import java.util.List;

public interface IStudentService extends
        Save<StudentBasicInfo>,
        Create<Student, Student>,
        ReadById<Student, Long>,
        ReadAll<StudentBasicInfo>,
        Archive<Student,Long> {
}
