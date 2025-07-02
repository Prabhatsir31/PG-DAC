package com.example.demo;

public class JwtResponse 
{
	private String token;

	public JwtResponse(String token) {
		super();
		this.token = token;
	}

	@Override
	public String toString() {
		return "JwtResponse [token=" + token + "]";
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public JwtResponse() {
		super();
	
	}
	
}
