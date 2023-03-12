package com.example.Lezione08_03.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.Lezione08_03.models.User;

public interface UserPageableRepo extends PagingAndSortingRepository<User, Long> {

		
	
}
