package com.example.schoolmanagement.service;

import java.util.List;

import com.example.schoolmanagement.entity.Teacher;

public interface TeacherService {
    List<Teacher> getAllTeachers();

    Teacher saveTeacher(Teacher student);

    Teacher getTeacherById(Long id);

    Teacher updateTeacher(Teacher student);

    void deleteTeacherById(Long id);
}
