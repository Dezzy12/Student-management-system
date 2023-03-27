package com.dezzy.smst;

import com.dezzy.smst.model.Student;
import com.dezzy.smst.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}


	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student("Neba", "Desmond", new Date(2022,12,21),"dezzypro99@gmail.com" );
		studentRepository.save(student1);

		Student student2 = new Student("M", "Jean", new Date(2022-01-22),"MJ@gmail.com" );
		studentRepository.save(student2);
	}
}
