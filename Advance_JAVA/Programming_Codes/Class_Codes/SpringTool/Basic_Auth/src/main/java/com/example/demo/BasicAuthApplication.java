package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.example.*")
public class BasicAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicAuthApplication.class, args);
	}

	@Bean
	public RestTemplate mytemplate 
	{
		
	}
}
