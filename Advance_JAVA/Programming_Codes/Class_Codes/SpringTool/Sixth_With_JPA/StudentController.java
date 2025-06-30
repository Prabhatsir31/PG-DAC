package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class StudentController 
{
	@Autowired
	StudentRepository srepository;
	@GetMapping("new_student")
	public String before()
	{
		return "Student";
	}
	@GetMapping("view_student")
	public String getStudents(HttpServletRequest request)
	{
		List<Student> studentlist=srepository.findAll();
		request.setAttribute("mylist", studentlist);
		return "View";
	}
	@PostMapping("new_student")
	public String afterSubmit(@RequestParam("name") String name,@RequestParam("age") int age)
	{
		Student student=new Student();
		student.setName(name);
		student.setAge(age);
		srepository.save(student);
		return "success";
	}
}