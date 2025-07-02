package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.MyUser;
import com.example.entities.RefreshToken;
import com.example.repositories.JwtRepository;
import com.example.repositories.RefreshTokenRepository;

import java.time.Duration;
import java.time.Instant;
import java.util.UUID;
@Service
public class RefreshTokenService 
{
	private long refreshTokenValidity=10*60*1000;
	@Autowired
	private RefreshTokenRepository repository;
	
	@Autowired
	private JwtRepository jwtrepository;
	
		
	public RefreshToken createRefreshToken(String username)
	{
		MyUser user=jwtrepository.findByUserName(username);
		RefreshToken rf=user.getRefreshtoken();
		if(rf==null)
		{
			rf=new RefreshToken(UUID.randomUUID().toString(),Instant.now().plusMillis(refreshTokenValidity),user);
		}
		else
		{
			// update existing refreshtoken i.e. change its expiry time
			rf.setExpiry(Instant.now().plusMillis(refreshTokenValidity));
		}
		user.setRefreshtoken(rf);
		repository.save(rf);
		return rf;
	}
	public RefreshToken verifyRefreshToken(String refreshtoken)
	{
		RefreshToken refreshToken=repository.findByRefreshToken(refreshtoken).orElseThrow(()->new RuntimeException("passed token does not exist"));
		System.out.println("Inside verifyrefreshtoken method"+refreshToken);
		if(refreshToken.getExpiry().compareTo(Instant.now())<0)
		{
			repository.delete(refreshToken);
			throw new RuntimeException("Refresh Token expired");
		}
		return refreshToken;
	}
}
