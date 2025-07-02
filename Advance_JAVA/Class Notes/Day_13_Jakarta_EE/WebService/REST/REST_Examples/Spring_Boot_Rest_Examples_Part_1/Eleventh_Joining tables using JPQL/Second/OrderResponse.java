package com.example.dtos;

public class OrderResponse 
{
	public OrderResponse(String name, String pname) {
		super();
		this.name = name;
		this.pname = pname;
	}

	private String name,pname;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "OrderResponse [name=" + name + ", pname=" + pname + "]";
	}
	
	
}
