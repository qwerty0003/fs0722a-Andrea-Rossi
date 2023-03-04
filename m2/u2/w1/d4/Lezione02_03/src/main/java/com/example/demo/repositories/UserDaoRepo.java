package com.example.demo.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public interface UserDaoRepo {

	public void createUser(User user);
	public void updateUser(User user);
	public void removeUser(long id);
	public User getUserById(Long id);
	public List<User> getAllUsers();
	
}
