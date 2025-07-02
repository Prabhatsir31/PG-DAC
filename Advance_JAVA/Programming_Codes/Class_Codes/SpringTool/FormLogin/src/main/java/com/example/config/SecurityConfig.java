package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.beans.factory.annotation.Autowired;
@Configuration
public class SecurityConfig 
{
	@Bean
	public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService userDetailsService(@Autowired PasswordEncoder pe) {
	    UserDetails normalUser = User.withUsername("normal")
	        .password(passwordEncoder().encode("normal123"))
	        .roles("NORMAL")
	        .build();

	    UserDetails adminUser = User.withUsername("admin")
	        .password(passwordEncoder().encode("admin123"))
	        .roles("ADMIN")
	        .build();

	    return new InMemoryUserDetailsManager(normalUser, adminUser);
	}
	// Using HttpSecurity we can configure which api can 
	// be accessed by whom, whether we want 'form-based' or 
	// 'basic' authentication
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity hs) throws Exception {
	    hs.csrf(csrf -> csrf.disable())
	      .authorizeHttpRequests(auth -> auth
	          .requestMatchers("/home/public").permitAll()
	          .requestMatchers("/home/normal").hasRole("NORMAL")
	          .requestMatchers("/home/admin").hasRole("ADMIN")
	          .anyRequest().authenticated()
	      )
	      .formLogin(withDefaults())
	      .exceptionHandling(ex -> ex.accessDeniedPage("/home/access-denied"));

	    return hs.build();
	}	
}
