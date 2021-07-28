package com.example.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.model.User;

public interface UserRepo extends JpaRepository<User,Long> {

	public User findByUsername(String username);
	
}
