package com.example.dtos;

public class NameState 
{
	private String name,statename;

	public NameState(String name, String statename) {
		super();
		this.name = name;
		this.statename = statename;
	}

	public String getName() {
		return name;
	}

	public String getStatename() {
		return statename;
	}

	@Override
	public String toString() {
		return "NameState [name=" + name + ", statename=" + statename + "]";
	}
}
