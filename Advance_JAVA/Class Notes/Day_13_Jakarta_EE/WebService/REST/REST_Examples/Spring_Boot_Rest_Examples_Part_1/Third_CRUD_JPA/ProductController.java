package com.example.FirstPro;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController  
@CrossOrigin("http://127.0.0.1:5500")
public class ProductController
{
	@Autowired
	ProductManager manager;
	
	
	 @GetMapping(value = "api/products")
	 public List<Product> showProducts1()
	 {
		  return manager.getProducts(); 
		
	 }
	
	 @GetMapping(value = "api/productsById/{pid}")
	 public Optional<Product> getPro(@PathVariable int pid)
	 {
		Optional<Product> p=manager.getProduct(pid);
		return p;
	 }
	 @GetMapping(value = "api/productsByCat/{cat}")
	 public List<Product> getProCat(@PathVariable String cat)
	 {
		return manager.getSelected(cat);
	 }
	 @DeleteMapping(value = "api/products/{pid}")
	 public void removepro(@PathVariable int pid)
	 {
		manager.delete(pid);
	 }
	 @PutMapping(value = "api/products/{pid}")
	 public void updatepro(@RequestBody Product product,@PathVariable int pid)
	 {
		System.out.println("inside updatepro of controller");
		manager.update(product,pid);
	 }
	 @PostMapping(value = "api/products")
	 public void addpro(@RequestBody Product product)
	 {
		System.out.println("addpro called");
		manager.addProduct(product);
	 }
}
