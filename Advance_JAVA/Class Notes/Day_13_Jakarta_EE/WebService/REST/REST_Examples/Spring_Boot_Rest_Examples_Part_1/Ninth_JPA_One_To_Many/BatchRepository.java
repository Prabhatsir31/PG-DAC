package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entities.Batch;


public interface BatchRepository extends JpaRepository<Batch, Integer> {


	@Query(value="select * from batch  where courseid=(select cid from course where cname=:cname)",nativeQuery = true)
	List<Batch> getBatches(@Param("cname")String cname);

}
