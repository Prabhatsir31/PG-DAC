package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;
@Controller
public class BookNewController
{

	// for welcome page "Home.html"

	@GetMapping("/")
	public String home()
	{
		return "Home";
	}
	@GetMapping("book")
	public ModelAndView before()
	{
 		Book defaultBook=new Book();
	
		return new ModelAndView("bookNew","mybook",defaultBook);
	}
	
	@PostMapping("book")
	public String afterSubmit(
		@ModelAttribute("mb") Book book,HttpSession session) 
	{
		session.setAttribute("val",2000);
		return "success";
	}
}