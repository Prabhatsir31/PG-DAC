package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dtos.OrderResponse;
import com.example.entities.Customer;
import com.example.repositories.CustomerRepository;


@RestController
public class OrderController 
{
	@Autowired
	private CustomerRepository crepository;

	
	@PostMapping("/placeorder")
	public Customer placeOrder(@RequestBody Customer ref)
	{
		return crepository.save(ref);
	}
	
	@GetMapping("/findAllOrders")
	public List<Customer> findAllOrders()
	{
		return crepository.findAll();
	}
	
	@GetMapping("/findJoinInfo")
	public List<OrderResponse> getJoinInfo()
	{
		return crepository.getJoinInformation();
	}
}
