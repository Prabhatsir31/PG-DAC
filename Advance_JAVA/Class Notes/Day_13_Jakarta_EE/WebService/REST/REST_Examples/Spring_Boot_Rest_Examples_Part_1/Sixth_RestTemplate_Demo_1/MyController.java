package com.example.demo;

import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController
{
	@Autowired
	private RestTemplate template;
	
	@GetMapping("/test")
	public String getData()
	{
//		return template.getForObject("https://jsonplaceholder.typicode.com/todos/1", String.class);
//		return template.getForObject("https://api.instantwebtools.net/v1/airlines", String.class);
		return template.getForObject("https://mocki.io/v1/341d3885-d0d7-429e-95fa-01e496a5f7ce", String.class);
	}
}
