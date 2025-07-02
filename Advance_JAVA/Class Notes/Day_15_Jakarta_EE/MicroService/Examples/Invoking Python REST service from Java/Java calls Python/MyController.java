package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController
{
	@Autowired
	private RestTemplate template;
	
	@GetMapping("/api/callPython")
	public List<?> getData()
	{
		return template.getForObject("http://127.0.0.1:5000/api/getmodulelist", List.class);
	}
}
