package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface StudentRepository extends JpaRepository<Student,Long>{

	@Query(value="select * from Student  where student_Id in(select sid from phone where phone_number=:phonenumber)",nativeQuery = true)
	Student getStudent(@Param("phonenumber")String phonenumber);
}


