package com.example.demo.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.demo.model.User;

@Configuration
public class UserConfiguration {

	
	@Bean
	@Scope("prototype")
	public User testUser() {
		return new User("Mario","Rossi","Roma",78,"maruzzo@email.org");
	}
}
