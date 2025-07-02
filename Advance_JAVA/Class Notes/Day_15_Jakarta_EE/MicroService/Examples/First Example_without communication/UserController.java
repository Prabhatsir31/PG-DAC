package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.example.entities.Contact;
import com.example.entities.User;
import com.example.services.UserService;

@RestController
public class UserController 
{
	@Autowired
	private UserService service;
	
	
	@GetMapping("/user/{userid}")
	public User getUser(@PathVariable("userid") int userid)
	{
		return service.getUser(userid);

	}
}
