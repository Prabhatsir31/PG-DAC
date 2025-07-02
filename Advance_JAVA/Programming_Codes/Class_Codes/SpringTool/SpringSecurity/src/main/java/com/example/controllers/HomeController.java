package com.example.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController 
{
	@GetMapping("/wish")
	public ResponseEntity<String> normalUser()
	{
		return ResponseEntity.ok("Hello from Spring Boot");
	}
}

