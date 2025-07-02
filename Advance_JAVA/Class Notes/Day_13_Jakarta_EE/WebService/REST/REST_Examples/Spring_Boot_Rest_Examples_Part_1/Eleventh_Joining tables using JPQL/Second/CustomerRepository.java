package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.dtos.OrderResponse;
import com.example.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>
{
	@Query("select new com.example.dtos.OrderResponse(c.name,p.pname) from Customer c join c.products p")
	public List<OrderResponse> getJoinInformation();
	
}
