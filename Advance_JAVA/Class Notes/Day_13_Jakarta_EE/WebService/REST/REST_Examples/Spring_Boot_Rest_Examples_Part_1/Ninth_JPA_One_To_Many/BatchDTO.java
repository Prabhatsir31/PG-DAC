package com.example.demo;


public class BatchDTO 
{
	private String batchtime,batchname;
	
	public String getBatchtime() {
		return batchtime;
	}


	public String getBatchname() {
		return batchname;
	}


	public BatchDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BatchDTO(String batchtime, String batchname) {
		super();
		this.batchtime = batchtime;
		this.batchname = batchname;
	}


	@Override
	public String toString() {
		return "[batchtime=" + batchtime + ", batchname=" + batchname + "]";
	}
	
	
}
