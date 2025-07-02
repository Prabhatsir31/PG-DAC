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
		System.out.println("in showProducts1 method");
		  return manager.getProducts(); 
		
	 }
	
	@GetMapping(value = "api/productsById/{pid}")
	 public Optional<Product> getPro(@PathVariable int pid)
	 {
		Optional<Product> p=manager.getProduct(pid);
		return p;
	 }
	@GetMapping(value = "api/productByName/{name}")
	 public Optional<Product> getProByName(@PathVariable String name)
	 {
		Optional<Product> p=manager.findByName(name);
		return p;
	 }

	@GetMapping(value = "api/productsByPrice/{price}")
	 public List<Product> showProducts2(@PathVariable int price)
	 {
		System.out.println("in showProducts2 method");
		  return manager.findByPrice(price);
		
	 }
	@GetMapping(value = "api/productsByOrderPrice")
	 public List<Product> showProducts3()
	 {
		System.out.println("in showProducts3 method");
		  return manager.findByOrderByPriceAsc();
		
	 }
	@GetMapping(value = "api/productsGreaterThan/{price}")
	 public List<Product> showProducts4(@PathVariable int price)
	 {
		System.out.println("in showProducts4 method");
		  return manager.findByPriceGreaterThan(price);
		
	 }
	@GetMapping(value = "api/productsByNameLike/{name}")
	 public List<Product> showProducts5(@PathVariable String name)
	 {
		System.out.println("in showProducts5 method");
		  return manager.findByNameContaining(name);
		
	 }
	@GetMapping(value = "api/productsByNameStartsWith/{name}")
	 public List<Product> showProducts6(@PathVariable String name)
	 {
		System.out.println("in showProducts6 method");
		  return manager.findByNameStartsWith(name);
		
	 }
	@GetMapping(value = "api/findByPriceGreaterThanAndQtyLessThan/{price},{qty}")
	 public List<Product> showProducts7(@PathVariable int price,@PathVariable int qty)
	 {
		System.out.println("in showProducts7 method");
		  return manager.findByPriceGreaterThanAndQtyLessThan(price, qty);
		
	 }
	@GetMapping(value = "api/productsSumQuantity")
	 public int getSumPrice()
	 {
		System.out.println("in getSumPrice method");
		  return manager.getTotalQuantity();
		
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
