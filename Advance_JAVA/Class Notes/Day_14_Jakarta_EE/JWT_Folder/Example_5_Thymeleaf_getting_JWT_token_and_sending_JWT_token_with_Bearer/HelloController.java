package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	 @GetMapping("/hello")
	    public Map<String, String> disp() {
	        Map<String, String> response = new HashMap<>();
	        response.put("message", "Hello World");
	        System.out.println("response is\t"+response);
// it has to be JSON object , then only it can be displayed by thymeleaf

	        return response;
	    }

}
