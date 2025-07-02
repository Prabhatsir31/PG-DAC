package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController 
{
	@Autowired
	private StudentService service;
	
	@PostMapping("/api/addStudent")
	public void saveStudent(@RequestBody Student ref)
	{
		service.save(ref);
	}
	
	@GetMapping("/api/students")
	public List<Student> getAllStudents()
	{
		return service.getAll();
	}
	@GetMapping("/api/student/{phonenumber}")
	public Student getStudent(@PathVariable String phonenumber)
	{
		return service.getStudent(phonenumber); 
	}
}
