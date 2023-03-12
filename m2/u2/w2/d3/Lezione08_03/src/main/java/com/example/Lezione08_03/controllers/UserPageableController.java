package com.example.Lezione08_03.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Lezione08_03.models.User;
import com.example.Lezione08_03.repositories.UserPageableRepo;

@RestController
@RequestMapping("/users/pageable")
public class UserPageableController {
	
	@Autowired UserPageableRepo userPage;
	
	@GetMapping
	public ResponseEntity<Page<User>> getPageableUsers(Pageable pageable){
		return new ResponseEntity<Page<User>>(userPage.findAll(pageable), HttpStatus.OK);
	}
	
}
