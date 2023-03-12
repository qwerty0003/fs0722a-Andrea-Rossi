package com.example.Lezione08_03.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.Lezione08_03.models.User;

@Configuration
public class UserConfig {
	
	@Value("${admin.name}") private String adminName;
	@Value("${admin.lastname}") private String adminLastname;
	@Value("${admin.city}") private String adminCity;
	
	@Bean("AdminUserBean")
	@Scope("singleton")
	public User newAdminUser() {
		User u = new User();
		u.setName(adminName);
		u.setLastname(adminLastname);
		u.setCity(adminCity);
		return u;
	}
	
}
