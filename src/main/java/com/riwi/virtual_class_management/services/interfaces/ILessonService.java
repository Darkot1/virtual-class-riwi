package com.riwi.virtual_class_management.services.interfaces;

import com.riwi.virtual_class_management.entities.Lesson;
import com.riwi.virtual_class_management.services.CRUD.*;

public interface ILessonService extends
        Save<Lesson>,
        Create<Lesson, Lesson>,
        ReadById<Lesson, Long>,
        ReadAll<Lesson>,
        Archive<Lesson,Long> {

    void destroy(Long id);

    Lesson disableLesson(Long id);
}
