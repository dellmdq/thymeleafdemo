package com.luv2code.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	//CRUD methods for free
	
	//add a method to sort by last name
	//JPA will parse the method name looks for a specific format and pattern
	//and creates a appropiate query behind the scenes....
	//findall (from employee) + order by last_name asc
	//www.luv2code.com/query-methods for more info
	public List<Employee> findAllByOrderByLastNameAsc(); 
		
		
		
}
