package com.example.Lezione08_03.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Lezione08_03.models.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {

	public boolean existsByNameAndLastname(String name, String lastname);
	
}
