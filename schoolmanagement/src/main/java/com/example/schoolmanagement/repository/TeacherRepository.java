package com.example.schoolmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.schoolmanagement.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long>{

}
