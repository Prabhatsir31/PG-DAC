package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Course;
import com.example.repositories.CourseRepository;

@Service
public class CourseMangerImpl implements CourseManager 
{
	@Autowired
	private CourseRepository c_repository;
	
	@Override
	public void addCourse(Course course) {
		c_repository.save(course);
		
	}

	@Override
	public List<Course> getAllCourses() {
		
		return c_repository.findAll();
	}

}
