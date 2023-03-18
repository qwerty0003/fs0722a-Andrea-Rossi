package com.example.micro1.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired Userservice us;
	
	@GetMapping("/test")
	public String test() {
		return "User MicroComp TESTING!";
	}
	
	@GetMapping("/string")
	public ResponseEntity<List<User>> getAll(){
		List<User> list = us.getAllUsers();
		return new ResponseEntity<List<User>>(list, HttpStatus.OK);
	}
	
	@GetMapping(value="/json",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<User>> getAllJson(){
		List<User> list = us.getAllUsers();
		return new ResponseEntity<List<User>>(list, HttpStatus.OK);
	}

}
