package com.example.entities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;



@Entity
public class Batch 
{
	private int b_id;
	private String batchname,batchtime;
	private Set<Student> students;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "batchid", referencedColumnName="b_id")
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public String getBatchname() {
		return batchname;
	}
	public void setBatchname(String batchname) {
		this.batchname = batchname;
	}
	public String getBatchtime() {
		return batchtime;
	}
	public void setBatchtime(String batchtime) {
		this.batchtime = batchtime;
	}
	@Override
	public String toString() {
		return "Batch [b_id=" + b_id + ", batchname=" + batchname + ", batchtime=" + batchtime + "]";
	}
	
	
}
