package com.example.demo;

public class RefreshTokenRequest 
{
	private String refreshtoken;

	@Override
	public String toString() {
		return "RefreshTokenRequest [refreshtoken=" + refreshtoken + "]";
	}

	public String getRefreshtoken() {
		return refreshtoken;
	}

	public void setRefreshtoken(String refreshtoken) {
		this.refreshtoken = refreshtoken;
	}

	public RefreshTokenRequest(String refreshtoken) {
		super();
		this.refreshtoken = refreshtoken;
	}

	public RefreshTokenRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
