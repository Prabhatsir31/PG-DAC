package com.example.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entities.Contact;

@Service
public class ContactServiceImpl implements ContactService 
{
	private static List<Contact> list;
	static
	{
		list=new ArrayList<>();
		list.add(new Contact(1,"Sachin","Sachin@gmail.com",101));
		list.add(new Contact(2,"Rahul","Rahul@gmail.com",101));
		list.add(new Contact(3,"Saurav","Saurav@gmail.com",102));
		list.add(new Contact(4,"Veeru","Veeru@gmail.com",100));
	}
	@Override
	public List<Contact> getContactsOfUser(int userid) {
		List<Contact> mylist=new ArrayList<>();
		for(Contact ref:list)
		{
			if(ref.getId()==userid)
			{
				mylist.add(ref);
			}
		}
		return mylist;
	}

}
