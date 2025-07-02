package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.BatchDTO;
import com.example.services.BatchManager;

@RestController
public class BatchController 
{
	@Autowired
	private BatchManager manager;
	
	@GetMapping("api/batches/{cname}")
	public List<BatchDTO> getBatches(@PathVariable String cname)
	{
		List<BatchDTO> list=manager.getBatches(cname);
		System.out.println("inside controller\t"+list);
		return list;
	}
}
