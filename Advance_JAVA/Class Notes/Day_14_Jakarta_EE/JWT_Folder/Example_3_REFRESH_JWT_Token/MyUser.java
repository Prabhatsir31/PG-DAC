package com.example.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name="myuser")
public class MyUser 
{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	
	  @OneToOne(mappedBy="myuser")
	  @JsonIgnore
	  private RefreshToken refreshtoken;
	  
	  public RefreshToken getRefreshtoken() { return refreshtoken; }
	  
	  public void setRefreshtoken(RefreshToken refreshtoken) { this.refreshtoken =
	  refreshtoken; }
	 

	@Column
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String username,password;

	

	/*
	 * @Override public String toString() { return "MyUser [id=" + id +
	 * ", refreshtoken=" + refreshtoken + ", userName=" + userName + ", password=" +
	 * password + "]"; }
	 */

	public MyUser(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		System.out.println("MyUser parameterized constructor");
	}

	@Override
	public String toString() {
		return "MyUser [id=" + id + ", userName=" + username + ", password=" + password + "]";
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
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name="password")
	public String getPassword() {
		return password;
	}
}
