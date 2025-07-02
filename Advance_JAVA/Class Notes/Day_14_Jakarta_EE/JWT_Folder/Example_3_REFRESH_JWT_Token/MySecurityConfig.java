package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.services.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
public class MySecurityConfig 
{
	
	@Autowired JWTAuthenticationFilter jwtfilter;
	 
	
	  @Autowired private CustomUserDetailsService customUserDetailsService;
	 
	
     @Bean	
	 public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
	 {
    	 System.out.println("securityFilterChain method");

    	 http.csrf(csrf -> csrf.disable())
         .authorizeHttpRequests(auth -> auth
             .requestMatchers("/token").permitAll()
             .requestMatchers("/refresh").permitAll()
             .anyRequest().authenticated()
         );
    	 
    	 http.addFilterBefore(jwtfilter, UsernamePasswordAuthenticationFilter.class);
    	 
    	 http.authenticationProvider(daoAuthenticationProvider());
    	 DefaultSecurityFilterChain build=http.build();
    	 return build;
	 }
	
	
	  @Bean public DaoAuthenticationProvider daoAuthenticationProvider() {
	  System.out.println("inside daoAuthenticationProvider method");
	  DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
	  provider.setUserDetailsService(customUserDetailsService); return provider; }
	 
}
