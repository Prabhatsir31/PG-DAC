package com.example.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student 
{
private int sid;
private String name;
private String age;
private Address address;

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}

@OneToOne(cascade=CascadeType.ALL)
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", name=" + name + ", age=" + age + ", address=" + address + "]";
}

}
