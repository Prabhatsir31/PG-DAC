package com.example.services;

import java.util.List;

import com.example.entities.Contact;

public interface ContactService 
{
	List<Contact> getContactsOfUser(int userid);
}
