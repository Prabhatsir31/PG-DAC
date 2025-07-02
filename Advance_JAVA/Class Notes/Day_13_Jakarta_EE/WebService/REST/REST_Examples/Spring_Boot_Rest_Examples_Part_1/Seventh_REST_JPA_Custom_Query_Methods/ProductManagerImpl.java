package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductManagerImpl implements ProductManager
{
	@Autowired
	ProductRepository repository;

	@Override
	public void addProduct(Product p) {
		repository.save(p);
		
		
	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
		
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}

	@Override
	public void update(Product product,int id) {
		// TODO Auto-generated method stub
		System.out.println("inside update method of service layer");
		repository.update(product.getName(),product.getPrice(),product.getQty(),id);
	}

	@Override
	public Optional<Product> getProduct(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Optional<Product> findByName(String name) {
		// TODO Auto-generated method stub
		return repository.findByName(name);
	}

	@Override
	public List<Product> findByPrice(int price) {
		// TODO Auto-generated method stub
		return repository.findByPrice(price);
	}

	@Override
	public List<Product> findByOrderByPriceAsc() {
		// TODO Auto-generated method stub
		return repository.findByOrderByPriceAsc();
	}

	@Override
	public List<Product> findByPriceGreaterThan(int price) {
		// TODO Auto-generated method stub
		return repository.findByPriceGreaterThan(price);
	}

	@Override
	public List<Product> findByNameContaining(String name) {
		// TODO Auto-generated method stub
		return repository.findByNameContaining(name);
	}

	@Override
	public List<Product> findByNameStartsWith(String name) {
		// TODO Auto-generated method stub
		return repository.findByNameStartsWith(name);
	}

	@Override
	public int getTotalQuantity() {
		// TODO Auto-generated method stub
		return repository.getTotalQuantity();
	}

	@Override
	public List<Product> findByPriceGreaterThanAndQtyLessThan(int price, int qty) {
		// TODO Auto-generated method stub
		return repository.findByPriceGreaterThanAndQtyLessThan(price, qty);
	}

}
