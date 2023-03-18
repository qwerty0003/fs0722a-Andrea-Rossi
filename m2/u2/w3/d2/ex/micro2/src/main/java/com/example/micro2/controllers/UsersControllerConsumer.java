package com.example.micro2.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class UsersControllerConsumer {
	
	String url = "http://localhost:8082/api/users";
	
	@GetMapping("/test")
	public String test() {
		RestTemplate rt = new RestTemplate();
		String rtUrl = "http://localhost:8082/api/users/test";
		ResponseEntity<String> response = rt.getForEntity(rtUrl, String.class);
		
		return "FROM CONSUMER: " + response.getBody();
	}
	
	@GetMapping("/users/string")
	public String getUsers() {
		RestTemplate rt = new RestTemplate();
		String rtUrl = "http://localhost:8082/api/users/string";
		String response = rt.getForObject(rtUrl, String.class);
		
		return "FROM CONSUMER: " + response;
	}
	
	@GetMapping("/users")
	public Object getJsonUsers() {
		RestTemplate rt = new RestTemplate();
		String rtUrl = "http://localhost:8082/api/users/json";
		Object response = rt.getForObject(rtUrl, Object.class);
		
		return response;
	}
	
	@GetMapping("/persone")
	public Object getAllPersone() {
		RestTemplate rt = new RestTemplate();
		String url2 = url+"/json";
		Object res = rt.getForObject(url2, Object.class);
		
		return res;
	}

}
