package com.example.demo;

public class JwtResponse 
{
	private String token;

	private String refreshtoken;
	
	public JwtResponse(String token,String refreshtoken) {
		super();
		this.token = token;
		this.refreshtoken=refreshtoken;
	}

	

	@Override
	public String toString() {
		return "JwtResponse [token=" + token + ", refreshtoken=" + refreshtoken + "]";
	}



	public String getRefreshtoken() {
		return refreshtoken;
	}



	public void setRefreshtoken(String refreshtoken) {
		this.refreshtoken = refreshtoken;
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
