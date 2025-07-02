package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController
{
	
	@PostMapping(value="/api/receivePerson")
	public ResponseEntity<String> receive_person(@RequestBody Person person)
	{
		System.out.println("Person received from Python is\t"+person);
		return ResponseEntity.ok("Thanks for sending person data");
	}
}
