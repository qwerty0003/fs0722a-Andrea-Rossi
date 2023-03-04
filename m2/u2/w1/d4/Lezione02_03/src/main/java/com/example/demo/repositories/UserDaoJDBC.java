package com.example.demo.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.model.User;

@Component
public class UserDaoJDBC implements UserDaoRepo {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	
	@Override
	public void createUser(User user) {
		String sql = "INSERT INTO users (name, lastname, city, age, email)"
				+ " VALUES (?,?,?,?,?)";
		
		jdbcTemplate.update(sql,
				user.getName(),
				user.getLastname(),
				user.getCity(),
				user.getAge(),
				user.getEmail());
	}

	@Override
	public void updateUser(User user) {
		String sql = "UPDATE users SET name=?, lastname=?, city=?, age=?, email=?"
				+ " WHERE  id = ?";
		
		jdbcTemplate.update(sql,
				user.getName(),
				user.getLastname(),
				user.getCity(),
				user.getAge(),
				user.getEmail(),
				user.getId());

	}

	@Override
	public void removeUser(long id) {
		
		String sql = "DELETE FROM users WHERE id = ?";
		
		jdbcTemplate.update(sql,id);
		

	}

	@Override
	public User getUserById(Long id) {
		
		String sql = "SELECT * FROM users WHERE id = ?";
		User u = jdbcTemplate.queryForObject(sql, new UserRowMapper(), id);
		
		return u;
	}

	@Override
	public List<User> getAllUsers() {
		String sql = "SELECT * FROM users";
		List<User> u = jdbcTemplate.query(sql, new UserRowMapper());

		return u;
	}

}
