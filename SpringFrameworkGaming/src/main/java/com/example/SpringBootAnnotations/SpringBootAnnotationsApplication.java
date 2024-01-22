package com.example.SpringBootAnnotations;

import com.example.SpringBootAnnotations.Beans.Employee;
import com.example.SpringBootAnnotations.Beans.Student;
import mypack.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringBootAnnotationsApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("Student1")
	private Student student;

	@Autowired
	private Date date;
	@Autowired
	private Employee employee;

	@Autowired
	private Dog dog;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAnnotationsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.student.studying();
		this.employee.working();
		this.dog.barking();
	}
}
