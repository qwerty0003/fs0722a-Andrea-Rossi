package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.User;
import com.example.demo.services.UserService;

@Component
public class UserRunner implements CommandLineRunner {
	
	@Autowired UserService userSrv;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("HELLO DOLLY!");
		//userSrv.insertUser();
		
		User u = userSrv.getUserById(1l);
		System.out.println(u);
	}

}
