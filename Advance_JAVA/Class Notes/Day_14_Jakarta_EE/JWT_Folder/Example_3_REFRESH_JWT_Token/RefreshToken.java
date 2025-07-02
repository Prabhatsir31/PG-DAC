package com.example.entities;

import java.time.Instant;
import jakarta.persistence.*;

@Entity
@Table(name="refresh_tokens")
public class RefreshToken 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int tokenid;
	
	private String refreshToken;
	private Instant expiry;
	
	@OneToOne
	private MyUser myuser;

	public RefreshToken() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RefreshToken(String refreshToken, Instant expiry, MyUser myuser) {
		super();
		this.refreshToken = refreshToken;
		this.expiry = expiry;
		this.myuser = myuser;
	}

	@Override
	public String toString() {
		return "RefreshToken [tokenid=" + tokenid + ", refreshToken=" + refreshToken + ", expiry=" + expiry
				+ ", myuser=" + myuser + "]";
	}

	public int getTokenid() {
		return tokenid;
	}

	public void setTokenid(int tokenid) {
		this.tokenid = tokenid;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public Instant getExpiry() {
		return expiry;
	}

	public void setExpiry(Instant expiry) {
		this.expiry = expiry;
	}

	public MyUser getMyuser() {
		return myuser;
	}

	public void setMyuser(MyUser myuser) {
		this.myuser = myuser;
	}
}
