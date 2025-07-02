package com.example.demo;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import javax.crypto.SecretKey;


@Service
public class JwtUtil {

	@Value("${jwt.secret}")
	private String secret; 

  //retrieve username from jwt token
  	public String getUsernameFromToken(String token) {
  		System.out.println("inside getUsernameFromToken method");
  		return getClaimFromToken(token, Claims::getSubject);
  	}
   	public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
  		System.out.println("inside getClaimFromToken method");
  		final Claims claims = getAllClaimsFromToken(token);
  		return claimsResolver.apply(claims);
  	}
      //for retrieveing any information from token we will need the secret key
  	private Claims getAllClaimsFromToken(String token) {
  		System.out.println("inside getAllClaimsFromToken method");
  		SecretKey secretkey = Keys.hmacShaKeyFor(secret.getBytes()); 
  		return Jwts.parserBuilder().setSigningKey(secretkey).build().parseClaimsJws(token).getBody();
		 
  	}
    public String generateToken(UserDetails userDetails) {
    	System.out.println("inside generateToken method");
        Map<String, Object> claims = new HashMap<>();
        return createToken(claims, userDetails.getUsername());
    }

    private String createToken(Map<String, Object> claims, String subject) {
    	System.out.println("inside createToken method");
        return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
           		.setExpiration(new Date(System.currentTimeMillis() + 2 * 60 * 1000)) // 2 minutes
        		.signWith(Keys.hmacShaKeyFor(secret.getBytes()),SignatureAlgorithm.HS256).compact();
    }

}
