package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Course;
import com.example.services.CourseManager;

@RestController
public class CourseController {
	
	@Autowired
	private CourseManager c_manager;
	
	@GetMapping("/api/course")
	public List<Course> getAllCourses()
	{
		return c_manager.getAllCourses();
	}
	
	@PostMapping("/api/course")
	public void addCourse(@RequestBody Course course)
	{
		c_manager.addCourse(course);
	}

}
