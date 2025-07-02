package com.example.demo;

import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Book
{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+bookName+"   "+price+"]";
	}
	
	@NotBlank(message="book name must be entered")
	@Size(min=4,max=20,message="bookname must be between 4 to 20")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "book name must contain characters")
	private String bookName;
	
	@Range(min=100,message="Price should not be less than {min}")
	private long price;

	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
}
