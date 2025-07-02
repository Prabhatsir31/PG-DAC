package com.example.demo;

import java.util.List;
import java.util.Optional;

public interface ProductManager
{
	void addProduct(Product p);
	List<Product> getProducts();
	void delete(int id);
	void update(Product product,int id);
	Optional<Product> getProduct(int id);
	Optional<Product> findByName(String name);	
	List<Product> findByPrice(int price);
	List<Product> findByOrderByPriceAsc();
	List<Product> findByPriceGreaterThan(int price);
	List<Product> findByNameContaining(String name);
	List<Product> findByNameStartsWith(String name);
	int getTotalQuantity();
	List<Product> findByPriceGreaterThanAndQtyLessThan(int price,int qty);
}
