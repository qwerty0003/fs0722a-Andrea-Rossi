package com.example.Lezione08_03.runners;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.Lezione08_03.models.User;
import com.example.Lezione08_03.services.UserService;

@Component
public class UserRunner implements ApplicationRunner {
	
	@Autowired UserService userSrv;
	@Autowired @Qualifier("AdminUserBean")
	ObjectProvider<User> userAdmin;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("USER RUNNER IS RUNNING!");
		
			//INSERITO
		//userSrv.createUser(userAdmin.getObject());
		
		
				
	}

}
