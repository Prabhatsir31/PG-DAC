package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
private int aid;
private String cityname;
private String statename;

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getCityname() {
	return cityname;
}
public void setCityname(String cityname) {
	this.cityname = cityname;
}
public String getStatename() {
	return statename;
}
public void setStatename(String statename) {
	this.statename = statename;
}
@Override
public String toString() {
	return "Address [aid=" + aid + ", cityname=" + cityname + ", statename=" + statename + "]";
}
}
