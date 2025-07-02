package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


public interface ProductRepository extends JpaRepository<Product,Integer> 
{
	
	@Modifying
	@Transactional
	@Query("update Product p set p.proname = :name, p.category=:category,p.price = :price, p.quantity=:qty where p.proid = :id")
	void update(@Param("name") String name,@Param("category")String category,@Param("price") double price,@Param("qty") int qty,@Param("id")int id);
	
	
	@Query("from Product p where p.category=:cat")
	List<Product> listCat(@Param("cat") String name);
}
