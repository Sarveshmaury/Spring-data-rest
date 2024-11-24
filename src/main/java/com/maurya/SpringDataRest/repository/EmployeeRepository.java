package com.maurya.SpringDataRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.maurya.SpringDataRest.entity.Employee;

//@RepositoryRestResource(path="members") //we can define custom path api [http://localhost:8080/magic-api/members] 
//than http://localhost:8080/magic-api/employees
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	//http://localhost:8080/magic-api/employees?sort=firstName
	//http://localhost:8080/magic-api/employees?sort=firstName,desc

}
