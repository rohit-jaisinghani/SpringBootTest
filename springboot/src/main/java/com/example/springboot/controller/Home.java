package com.example.springboot.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins="*",allowedHeaders = "*")
public class Home {

	@GetMapping("/welcome")
	public String welcome()
	{
		return "{\"name\":\"Roh\"}";
	}
	
	
	@GetMapping("/getuser")
	public String getUser()
	{
		return "{\"name\":\"Rohit\"}";
	}
}
