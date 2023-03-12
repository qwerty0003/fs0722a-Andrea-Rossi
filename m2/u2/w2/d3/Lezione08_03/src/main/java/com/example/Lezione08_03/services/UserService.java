package com.example.Lezione08_03.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Lezione08_03.models.User;
import com.example.Lezione08_03.repositories.UserRepo;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {
	
	@Autowired UserRepo userRp;
	
	public User createUser(User user) {
        if(userRp.existsByNameAndLastname(user.getName(), user.getLastname())) {
             throw new EntityExistsException("USER NAME AND LASTNAME ALREADY EXISTS!!");
        }
        userRp.save(user);
        return user;
        
    }
	
	public List<User> getAllUsers(){
		return (List<User>) userRp.findAll();
	}

	public User getUserById(Long id) {
        if(!userRp.existsById(id)) {
             throw new EntityNotFoundException("USER DO NOT EXIST!!!!");
        }
        return userRp.findById(id).get();
    }
	
	public void removeUser(Long id) {
		if(!userRp.existsById(id)) {
			throw new EntityNotFoundException("USER DO NOT EXIST!!!!");
		}
		userRp.deleteById(id);
		System.out.println("USER DELETED! :'D");
	}
	
	public User updateUser(User u) {
		if(!userRp.existsById(u.getId())) {
            throw new EntityNotFoundException("USER DO NOT EXIST!!!!");
       }
		userRp.save(u);
		return u;
	}
	
}
