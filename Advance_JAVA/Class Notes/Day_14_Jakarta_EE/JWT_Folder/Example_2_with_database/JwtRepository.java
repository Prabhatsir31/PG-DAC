package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
@Repository
public interface JwtRepository extends  JpaRepository<MyUser,Integer> 
{

	@Query(value="select * from myuser where username=:name and password=:password",nativeQuery=true)
	Optional<MyUser> findByUserNameAndPassword(String name,String password);
	
	
}
