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
		repository.update(product.getProname(),product.getCategory(),product.getPrice(),product.getQuantity(),id);
	}

	@Override
	public Optional<Product> getProduct(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Product> getSelected(String cat) {
		// TODO Auto-generated method stub
		return repository.listCat(cat);
	}
	
	

}
