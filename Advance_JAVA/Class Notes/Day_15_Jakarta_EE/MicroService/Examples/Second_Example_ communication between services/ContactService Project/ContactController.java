package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Contact;
import com.example.services.ContactService;

@RestController
public class ContactController 
{
	@Autowired
	private ContactService service;
	
	@GetMapping("/contact/{userid}")
	public List<Contact> getContacts(@PathVariable("userid") int userid)
	{
		return service.getContactsOfUser(userid);
	}
}
