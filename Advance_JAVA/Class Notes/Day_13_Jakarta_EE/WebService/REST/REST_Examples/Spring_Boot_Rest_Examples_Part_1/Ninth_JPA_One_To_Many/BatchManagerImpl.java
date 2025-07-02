package com.example.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.BatchDTO;
import com.example.entities.Batch;
import com.example.repositories.BatchRepository;

@Service
public class BatchManagerImpl implements BatchManager {

	
	@Autowired
	private BatchRepository repository;
	@Override
	public List<BatchDTO> getBatches(String cname) 
	{
		List<Batch> mylist= repository.getBatches(cname);
		System.out.println(mylist);
		Iterator<Batch> itr=mylist.iterator();
		List<BatchDTO> batches=new ArrayList<BatchDTO>();
		while(itr.hasNext())
		{
			Batch b=itr.next();
			batches.add(new BatchDTO(b.getBatchname(),b.getBatchtime()));
		}
		System.out.println("Batches are\t"+batches);
		return batches;
	}

}
