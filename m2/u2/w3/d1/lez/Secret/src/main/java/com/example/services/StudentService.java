package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.Student;
import com.example.repos.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo sr;

	public String addStudent(Student s) {
		sr.save(s);
		return "Studente " + s.getName() +" "+
				s.getLastname()
		+ " aggiunto al db!";
	}
	
	public List<Student> getAll(){
		return sr.findAll();
	}

}
