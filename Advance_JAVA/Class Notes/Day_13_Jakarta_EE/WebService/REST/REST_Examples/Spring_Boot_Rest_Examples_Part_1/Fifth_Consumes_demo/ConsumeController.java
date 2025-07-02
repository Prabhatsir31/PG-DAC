package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumeController 
{
	
    @PostMapping(value="/xml",consumes={MediaType.APPLICATION_XML_VALUE})
	//@PostMapping(value = "/xml", consumes = {"application/xml"})
	public void consumeXMLRequest(@RequestBody Student s)
    {
        System.out.println("**Received XML request**");
        System.out.println(" Name : "+s.getName());
        System.out.println(" Age  : "+s.getAge());
    }
    @PostMapping(value="/json1",consumes={MediaType.APPLICATION_JSON_VALUE})
    public void consumeJSONRequest(@RequestBody Student s)
    {
       System.out.println("**Received JSON request**");
       System.out.println(" Name : "+s.getName());
       System.out.println(" Age  : "+s.getAge());
    }
}
