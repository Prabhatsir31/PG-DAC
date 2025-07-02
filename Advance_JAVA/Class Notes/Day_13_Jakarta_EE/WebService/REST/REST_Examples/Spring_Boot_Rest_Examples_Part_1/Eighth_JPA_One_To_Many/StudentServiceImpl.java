package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl implements StudentService 
{
	@Autowired
	private StudentRepository s_repository;
	@Override
	public void save(Student ref) 
	{
		s_repository.save(ref);
	}
	@Override
	public List<Student> getAll() {
		
		return s_repository.findAll();
	}
	@Override
	public Student getStudent(String phonenumber) {
		
		return s_repository.getStudent(phonenumber);
	}

}
