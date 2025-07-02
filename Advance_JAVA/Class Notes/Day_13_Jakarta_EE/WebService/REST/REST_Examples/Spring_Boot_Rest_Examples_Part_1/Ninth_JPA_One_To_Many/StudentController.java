package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Student;
import com.example.services.StudentManager;

@RestController
public class StudentController 
{
	@Autowired
	private StudentManager manager;
	
	@GetMapping("api/students/{cname}")
	public List<Student> getStudents(@PathVariable String cname)
	{
		return manager.getStudents(cname);
	}
}
