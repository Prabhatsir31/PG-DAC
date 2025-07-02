package com.example.demo;


import java.io.IOException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.example.services.CustomUserDetailsService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JWTAuthenticationFilter extends OncePerRequestFilter
{
	
	  @Autowired private CustomUserDetailsService customuserdetailsservice;
	 
	
	@Autowired
	private JwtUtil jwtutil;
	

	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		System.out.println("inside doFilterInternal method");
		String requestTokenHeader=request.getHeader("Authorization");
		String username=null;
		String jwttoken=null;
		if(requestTokenHeader!=null && requestTokenHeader.startsWith("Bearer "))
		{
			jwttoken=requestTokenHeader.substring(7);
			try
			{
				username=jwtutil.getUsernameFromToken(jwttoken);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			UserDetails userdetails=customuserdetailsservice.loadUserByUsername(username);
			if(username!=null && SecurityContextHolder.getContext().getAuthentication()==null)
			{
				UsernamePasswordAuthenticationToken usernamepasswordauthenticationtoken=	new UsernamePasswordAuthenticationToken(userdetails,null,userdetails.getAuthorities());
				usernamepasswordauthenticationtoken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				SecurityContextHolder.getContext().setAuthentication(usernamepasswordauthenticationtoken);
			}
			else
			{
				System.out.println("Token not validated");
			}
			
		}
		System.out.println("before calling doFilter of JWTAuthenticationFilter");
		filterChain.doFilter(request, response);
	}

}

