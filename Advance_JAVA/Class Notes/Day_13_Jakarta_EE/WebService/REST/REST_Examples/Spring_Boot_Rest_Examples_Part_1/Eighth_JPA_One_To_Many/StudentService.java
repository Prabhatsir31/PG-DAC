package com.example.demo;

import java.util.List;


public interface StudentService 
{
	void save(Student ref);
	List<Student> getAll();
	Student getStudent(String phonenumber);
}
