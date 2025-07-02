package com.example.services;

import java.util.List;

import com.example.entities.Student;

public interface StudentManager 
{
	List<Student> getStudents(String cname);
}
