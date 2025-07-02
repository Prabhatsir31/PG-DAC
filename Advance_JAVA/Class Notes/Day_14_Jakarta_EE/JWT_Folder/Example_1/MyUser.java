package com.example.demo;

public class MyUser 
{
	private String username,password;

	@Override
	public String toString() {
		return "MyUser [username=" + username + ", password=" + password + "]";
	}

	public MyUser(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		System.out.println("MyUser parameterized constructor");
	}

	public MyUser() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("MyUser default constructor");
	}

	public void setUsername(String username) {
		this.username = username;
		System.out.println("MyUser set username method");
	}

	public void setPassword(String password) {
		this.password = password;
		System.out.println("MyUser set password method");
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
}
