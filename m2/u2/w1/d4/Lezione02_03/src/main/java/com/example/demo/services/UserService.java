package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.model.User.UserBuilder;
import com.example.demo.repositories.UserDaoJDBC;

@Service
public class UserService {

	@Autowired UserDaoJDBC jdbc;
	
	public User createTestUser() {
		User u = User.builder().name("Maruzzo").lastname("Dei Sette Mari").city("Kings Landing")
				.age(88).email("nuoviEvecchi@dei.com").build();
		return u;
	}
	
	public void insertUser() {
		jdbc.createUser(createTestUser());
	}
	
	public User getUserById(long id) {
		return jdbc.getUserById(id);
		
	}
}
