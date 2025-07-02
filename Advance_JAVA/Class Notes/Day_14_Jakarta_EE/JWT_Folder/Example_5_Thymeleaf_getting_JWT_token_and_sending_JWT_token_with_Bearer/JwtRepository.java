package com.example.demo;

import org.springframework.stereotype.Repository;

@Repository
public class JwtRepository 
{
	public boolean findUser(MyUser myuser){
		System.out.println("inside findUser method");
		String uname=myuser.getUsername();
		String pwd=myuser.getPassword();
		return uname.equalsIgnoreCase("scott") && pwd.equals("tiger");
		}
	
}
