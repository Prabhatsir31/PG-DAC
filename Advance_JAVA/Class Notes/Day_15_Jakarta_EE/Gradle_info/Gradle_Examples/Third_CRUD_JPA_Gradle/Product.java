package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="prod1")
public class Product 
{
	/**
	 * 
	 */
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private int proid;
	private String proname;
	private String category;
	private int quantity;
	private double price;
	/**
	 * @param proid
	 * @param proname
	 * @param category
	 * @param quantity
	 * @param price
	 */
	public Product(int proid, String proname, String category, int quantity, double price) {
		super();
		this.proid = proid;
		this.proname = proname;
		this.category = category;
		this.quantity = quantity;
		this.price = price;
	}
	/**
	 * @return the proid
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getProid() {
		return proid;
	}
	/**
	 * @param proid the proid to set
	 */
	public void setProid(int proid) {
		this.proid = proid;
	}
	/**
	 * @return the proname
	 */
	public String getProname() {
		return proname;
	}
	/**
	 * @param proname the proname to set
	 */
	public void setProname(String proname) {
		this.proname = proname;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [proid=" + proid + ", proname=" + proname + ", category=" + category + ", quantity=" + quantity
				+ ", price=" + price + "]";
	};
	
}
