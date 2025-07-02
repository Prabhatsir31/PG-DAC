package com.example.services;

import java.util.List;

import com.example.entities.Course;

public interface CourseManager
{
	 void addCourse(Course course);
	 List<Course> getAllCourses();
}