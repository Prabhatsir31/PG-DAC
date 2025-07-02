package com.example.controllers;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.JwtResponse;
import com.example.demo.JwtUtil;
import com.example.demo.RefreshTokenRequest;
import com.example.entities.MyUser;
import com.example.entities.RefreshToken;
import com.example.repositories.JwtRepository;
import com.example.services.CustomUserDetailsService;
import com.example.services.RefreshTokenService;

@RestController
public class JwtController 
{
	
	@Autowired
	private JwtUtil jwtutil;
	
	@Autowired
	private JwtRepository repository;
	
	@Autowired
	private CustomUserDetailsService customuserdetailsservice;
	
	@Autowired
	private RefreshTokenService refreshtokenservice;
	
	@PostMapping("/token")
	public ResponseEntity<?> generateToken(@RequestBody MyUser myuser)
	{
		try
		{
		System.out.println("inside token method");
		System.out.println(myuser);
		Optional<MyUser> user=repository.findByUserNameAndPassword(myuser.getUsername(),myuser.getPassword());
		System.out.println("User is present?"+user.isPresent());
		if(user.isEmpty())
		{
			throw new UsernameNotFoundException("credentials don't match");
		}
		customuserdetailsservice.setPassword(myuser.getPassword());
		UserDetails userdetails=customuserdetailsservice.loadUserByUsername(myuser.getUsername());
		String token=this.jwtutil.generateToken(userdetails);
		System.out.println("JWT "+token);
		
		RefreshToken refreshtoken=refreshtokenservice.createRefreshToken(userdetails.getUsername());
		
		return ResponseEntity.ok(new JwtResponse(token,refreshtoken.getRefreshToken()));
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
			return null;
		}
	}
	@PostMapping("/refresh")
	public ResponseEntity<?> refreshJWTToken(@RequestBody RefreshTokenRequest request)
	{
		System.out.println("refreshJWTToken 1");
		RefreshToken refreshtoken=refreshtokenservice.verifyRefreshToken(request.getRefreshtoken());
		System.out.println("refreshJWTToken 2");
		MyUser user=refreshtoken.getMyuser();
		System.out.println("refreshJWTToken 3"+user);
		UserDetails userdetails=customuserdetailsservice.loadUserByUsername(user.getUsername());
		System.out.println("refreshJWTToken 4");
		String token=this.jwtutil.generateToken(userdetails);
		System.out.println("refreshJWTToken 5");
		System.out.println("New JWT "+token);
		System.out.println("refreshJWTToken 6");
		return ResponseEntity.ok(new JwtResponse(token,refreshtoken.getRefreshToken()));
	}
}
