package com.example.micro1.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class UserRunner implements ApplicationRunner {
	
	@Autowired Userservice us;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("RUNNING USER");
		//insertPers();

	}
	
	public void insertPers() {
		User u1 = User.builder()
				.name("Guy Guuy's").city("Miami, FL")
				.age(20).build();
		
		User u2 = User.builder()
				.name("Dumb Dumbleton").city("Rome, IN")
				.age(21).build();
		
		User u3 = User.builder()
				.name("Idk Rlly Idk").city("Tokio")
				.age(60).build();
		
		us.insertUser(u1);
		us.insertUser(u2);
		us.insertUser(u3);
		
	}

}
