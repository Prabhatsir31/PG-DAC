package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.dtos.NameState;
import com.example.entities.Student;


public interface StudentRepository extends JpaRepository<Student, Integer> 
{
	@Query("select new com.example.dtos.NameState(s.name,a.statename) from  Student s join s.address a")
	public List<NameState> getNameState();
}
