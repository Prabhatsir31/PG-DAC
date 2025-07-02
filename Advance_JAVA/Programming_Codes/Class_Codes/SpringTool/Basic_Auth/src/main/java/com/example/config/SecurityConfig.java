package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
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

@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // User definitions
    @Bean
    public UserDetailsService userDetailsService(@Autowired
        	PasswordEncoder pe) {
    	
        UserDetails normalUser = User
                .withUsername("scott")
                .password(pe.encode("tiger"))
                .roles("NORMAL")
                .build();
        System.out.println("Password for Normal user is\t" + passwordEncoder().encode("tiger"));

        UserDetails publicUser = User
                .withUsername("vita1")
                .password(pe.encode("vita1"))
                .roles("PUBLIC")
                .build();

        UserDetails adminUser = User
                .withUsername("master")
                .password(pe.encode("blaster"))
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(normalUser, publicUser, adminUser);
    }

    // Route protection and login mechanism

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/home/public").hasRole("PUBLIC")
                .requestMatchers("/home/normal").hasRole("NORMAL")
                .requestMatchers("/home/admin").hasRole("ADMIN")
                .anyRequest().authenticated()
            )
            .exceptionHandling(ex -> ex
                .accessDeniedPage("/home/access-denied")
            )
            .httpBasic(basic -> {});
        return http.build();
    }

}
