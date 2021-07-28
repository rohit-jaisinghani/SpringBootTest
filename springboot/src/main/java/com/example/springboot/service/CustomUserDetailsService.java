package com.example.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.springboot.model.CustomUserDetails;
import com.example.springboot.model.User;
import com.example.springboot.repo.UserRepo;

import java.util.*;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepo userRepo;
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user=this.userRepo.findByUsername(userName);
		if(user==null)
		{
			throw new UsernameNotFoundException("User not found");
		}
		else
		{
			return new CustomUserDetails(user);
		}
		
	}

}
