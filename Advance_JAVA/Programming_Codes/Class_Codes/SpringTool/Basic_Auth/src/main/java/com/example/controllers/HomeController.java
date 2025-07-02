package com.example.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController 
{
	@GetMapping("/normal")
	public ResponseEntity<String> normalUser()
	{
		return ResponseEntity.ok("Hello from normal user");
	}
	@GetMapping("/public")
	public ResponseEntity<String> publicUser()
	{
		return ResponseEntity.ok("Hello from public user");
	}
	@GetMapping("/admin")
	public ResponseEntity<String> adminUser()
	{
		return ResponseEntity.ok("Hello from admin user");
	}
	@GetMapping("/access-denied")
	public ResponseEntity<String> accessDenied()
	{
		return ResponseEntity
	            .status(403)
	            .body("<h2 style='color:red;'>You do not have permission to access this page.</h2>");
	}
}


