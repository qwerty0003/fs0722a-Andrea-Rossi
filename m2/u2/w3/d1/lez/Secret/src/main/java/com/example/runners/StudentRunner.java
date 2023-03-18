package com.example.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.models.Student;
import com.example.services.StudentService;

@Component
public class StudentRunner implements ApplicationRunner {

	@Autowired StudentService ss;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("RUNNER RUNNING");

		//setstudents();
		getAllStudents();

		System.out.println("RUNNER STOPPED");
	}

	private void setstudents() {
		Student s1 = Student.builder()
				.name("Mark").lastname("Raffalo")
				.city("Rome , IN").age(25)
				.secretCode("123")
				.build();

		String res = ss.addStudent(s1);
		
		Student s2 = Student.builder()
				.name("Karl").lastname("Karlsson")
				.city("Oslo").age(35)
				.secretCode("964")
				.build();
		
		String ress = ss.addStudent(s2);
		System.out.println(ress);
		
		Student s3 = Student.builder()
				.name("Beppe").lastname("Beppis")
				.city("Pescara").age(66)
				.secretCode("953")
				.build();
		
		String resss = ss.addStudent(s3);
		System.out.println(resss);
		
		Student s4 = Student.builder()
				.name("Guy").lastname("Dumb")
				.city("Miami, FL").age(33)
				.secretCode("666")
				.build();
		
		String ressst = ss.addStudent(s4);
		System.out.println(ressst);
	}
	
	private void getAllStudents() {
		List<Student> studentList = ss.getAll();
		studentList.forEach(s -> System.out.println(s));
	}

}
