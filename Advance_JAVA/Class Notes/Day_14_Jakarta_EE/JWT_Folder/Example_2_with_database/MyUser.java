package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name="myuser")
public class MyUser 
{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String userName,password;

	@Override
	public String toString() {
		return "MyUser [username=" + userName + ", password=" + password + "]";
	}

	public MyUser(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
		System.out.println("MyUser parameterized constructor");
	}

	public MyUser() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("MyUser default constructor");
	}



	public void setPassword(String password) {
		this.password = password;
		System.out.println("MyUser set password method");
	}

	@Column(name="username")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name="password")
	public String getPassword() {
		return password;
	}
}
