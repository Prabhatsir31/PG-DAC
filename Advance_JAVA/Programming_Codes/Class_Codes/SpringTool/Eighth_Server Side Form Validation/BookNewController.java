package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.validation.Valid;
@Controller
public class BookNewController
{
	@GetMapping("book")
	public ModelAndView before()
	{
 		Book defaultBook=new Book();
	
		return new ModelAndView("bookNew","mybook",defaultBook);
	}
	
	// @Valid is to trigger the validations set inside POJO
	// BindingResult is the one where validation results are stored
	@PostMapping("book")
	public String afterSubmit(@Valid
		@ModelAttribute("mybook") Book book,BindingResult result) 
	 {
		if(result.hasErrors())
		{
			return "bookNew";
		}
		return "success";
	}
}
