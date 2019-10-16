package com.lambdaschool.school.service;

import com.lambdaschool.school.model.Course;
import com.lambdaschool.school.model.Student;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;

public interface StudentService
{
    List<Student> findAll();

    List<Student> findAllPageable(Pageable pageable);

    Student findStudentById(long id);

    List<Student> findStudentByNameLike(String name);

    void delete(long id);

    Student save (Student student);

    Student update(Student student, long id);
}
