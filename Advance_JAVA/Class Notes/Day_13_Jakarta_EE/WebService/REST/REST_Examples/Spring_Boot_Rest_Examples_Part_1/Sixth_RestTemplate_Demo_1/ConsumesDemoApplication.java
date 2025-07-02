package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumesDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumesDemoApplication.class, args);
	}

	/*
	 * Spring @Bean Annotation is applied on a method to specify that it returns a
	 * bean to be managed by Spring context. Spring Bean annotation is usually
	 * declared in Configuration classes methods.
	 */
	@Bean
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
}
