package com.example.micro1.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userservice {
	
	@Autowired UserRepo ur;
	
	public void insertUser(User u) {
		ur.save(u);
		System.out.println("User "+ u.getName() + " insert");
	}
	
	public List<User> getAllUsers(){
		return ur.findAll();
	}

}
