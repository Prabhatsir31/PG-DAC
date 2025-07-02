package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dtos.NameState;
import com.example.entities.Student;
import com.example.repositories.StudentRepository;

@RestController
public class StudentController 
{
	@Autowired
	StudentRepository srepository;
	
	@PostMapping("/addStudent")
	public void addStudent(@RequestBody Student student)
	{
		srepository.save(student);
	}
	
	@GetMapping("/getAllStudents")
	public List<Student> getAllStudents()
	{
		return srepository.findAll();
	}
	
	@GetMapping("/getNameState")
	public List<NameState> getNameState()
	{
		return srepository.getNameState();
	}
}
