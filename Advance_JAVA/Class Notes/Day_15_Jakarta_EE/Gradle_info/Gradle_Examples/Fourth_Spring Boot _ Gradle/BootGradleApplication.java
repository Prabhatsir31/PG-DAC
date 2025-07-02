package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.example.*")
public class BootGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootGradleApplication.class, args);
	}

}
