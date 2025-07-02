package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PHONE")
public class Phone {
private long phoneId;
private String phoneType;
private String phoneNumber;
public Phone() {
}
public Phone(String phoneType, String phoneNumber) {
this.phoneType = phoneType;
this.phoneNumber = phoneNumber;
}
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name = "PHONE_ID")
public long getPhoneId() {
return this.phoneId;
}
public void setPhoneId(long phoneId) {
this.phoneId = phoneId;
}
@Column(name = "PHONE_TYPE", nullable = false, length=10)
public String getPhoneType() {
return this.phoneType;
}
public void setPhoneType(String phoneType) {
this.phoneType = phoneType;
}
@Column(name = "PHONE_NUMBER", nullable = false, length=15)
public String getPhoneNumber() {
return this.phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
this.phoneNumber = phoneNumber;
}
}
