package com.example.entities;

public class Contact 
{
	private int cid;
	private String email,contactName;
	
	private int id;  // belongs to User

	public Contact(int cid, String email, String contactName, int id) {
		super();
		this.cid = cid;
		this.email = email;
		this.contactName = contactName;
		this.id = id;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
