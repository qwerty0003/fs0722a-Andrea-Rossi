package com.example.Lezione08_03.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Lezione08_03.models.User;
import com.example.Lezione08_03.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired UserService userSrv;
	
	@GetMapping
	public ResponseEntity<List<User>> getAllUsers(){
		return new ResponseEntity<List<User>>(userSrv.getAllUsers(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById(@PathVariable Long id){
		return new ResponseEntity<User>(userSrv.getUserById(id), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User u) {
		User usr = userSrv.createUser(u);
		return new ResponseEntity<User>(usr, HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<User> updateUser(@RequestBody User u) {
		User usr = userSrv.updateUser(u);
		return new ResponseEntity<User>(usr, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> removeUser(@PathVariable Long id) {
		userSrv.removeUser(id);
		return new ResponseEntity<String>("USER DELETED :'D", HttpStatus.OK);
	}
	

}
