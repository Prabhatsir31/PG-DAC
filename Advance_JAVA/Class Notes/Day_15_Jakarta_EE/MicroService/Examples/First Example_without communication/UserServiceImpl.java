package com.example.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entities.User;

@Service
public class UserServiceImpl implements UserService 
{
	private static List<User> list;
	static
	{
		list=new ArrayList<>();
		list.add(new User(100,"Abc","9870682272"));
		list.add(new User(101,"Xyz","9870685689"));
		list.add(new User(102,"Pqr","9856684272"));
	}
	@Override
	public User getUser(int id) {
		User user=null;
		for(User ref:list)
		{
			if(ref.getId()==id)
			{
				user=ref;
			}
		}
		return user;
	}
}
