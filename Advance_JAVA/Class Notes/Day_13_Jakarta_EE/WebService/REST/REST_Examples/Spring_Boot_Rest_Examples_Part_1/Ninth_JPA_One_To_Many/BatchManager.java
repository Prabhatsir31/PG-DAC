package com.example.services;

import java.util.List;

import com.example.demo.BatchDTO;

public interface BatchManager 
{
	List<BatchDTO> getBatches(String cname);
}
