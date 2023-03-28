package com.dezzy.smst.service;


import com.dezzy.smst.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student createStudent(Student student);
}
