package com.wipro.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
	
	
	//select * from Employee where name="amit";
       Optional<Employee>  findByName(String name);

       	
}
