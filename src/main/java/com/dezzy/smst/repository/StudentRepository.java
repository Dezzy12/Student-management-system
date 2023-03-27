package com.dezzy.smst.repository;

import com.dezzy.smst.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
