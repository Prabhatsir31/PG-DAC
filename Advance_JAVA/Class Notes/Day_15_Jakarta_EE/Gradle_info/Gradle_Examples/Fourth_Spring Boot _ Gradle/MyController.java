package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/getmessage")
	public String getMessage()
	{
		return "Hello from MyController";
	}

}
