package com.example.demo;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtController 
{
	
	@Autowired
	private JwtUtil jwtutil;
	
	@Autowired
	private JwtRepository repository;
	
	@Autowired
	private CustomUserDetailsService customuserdetailsservice;
	
	@PostMapping("/token")
	public ResponseEntity<?> generateToken(@RequestBody MyUser myuser)
	{
		try
		{
		System.out.println("inside token method");
		System.out.println(myuser);
		Optional<MyUser> user=repository.findByUserNameAndPassword(myuser.getUserName(),myuser.getPassword());
		System.out.println("User is present?"+user.isPresent());
		if(user.isEmpty())
		{
			throw new UsernameNotFoundException("credentials don't match");
		}
		customuserdetailsservice.setPassword(myuser.getPassword());
		UserDetails userdetails=customuserdetailsservice.loadUserByUsername(myuser.getUserName());
		String token=this.jwtutil.generateToken(userdetails);
		System.out.println("JWT "+token);
		return ResponseEntity.ok(new JwtResponse(token));
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
			return null;
		}
	}
}
