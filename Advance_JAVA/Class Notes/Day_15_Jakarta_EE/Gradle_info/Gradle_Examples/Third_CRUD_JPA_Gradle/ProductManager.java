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
	List<Product> getSelected(String cat);
}
