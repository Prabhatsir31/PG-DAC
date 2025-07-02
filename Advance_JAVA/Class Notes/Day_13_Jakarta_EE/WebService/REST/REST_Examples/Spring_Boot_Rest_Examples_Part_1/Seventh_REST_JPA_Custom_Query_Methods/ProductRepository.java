package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Product,Integer> 
{
	
	@Modifying
	@Query("update Product p set p.name = :name,p.price = :price, p.qty=:qty where p.id = :id")
	void update(@Param("name") String name,@Param("price") int price,@Param("qty") int qty,@Param("id")int id);
	@Query("SELECT sum(p.qty) from Product p")
    int getTotalQuantity();
	
	// JPA custom query methods
	
	Optional<Product> findByName(String name);	
	List<Product> findByPrice(int price);
	List<Product> findByOrderByPriceAsc();
	List<Product> findByPriceGreaterThan(int price);
	List<Product> findByNameContaining(String name);
	List<Product> findByNameStartsWith(String name);
	List<Product> findByPriceGreaterThanAndQtyLessThan(int price,int qty);

}
