package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student 
{
	private int rollno;
	private String name;
	private int age;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	@Column
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	@Column
	public void setAge(int age) {
		this.age = age;
	}
	
}
