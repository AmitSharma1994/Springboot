package com.wipro.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.entity.Employee;
import com.wipro.repository.EmployeeRepository;



@RestController   
public class EmployeeController {

	@Autowired
	EmployeeRepository employeerepository;

	
	// @PostMapping("/employees")
	
	@RequestMapping(path = "/employees", method = RequestMethod.POST)
	
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp) {

		Employee emp1 = employeerepository.save(emp);

		return new ResponseEntity<Employee>(emp1,HttpStatus.CREATED);
	}


	 // @GetMapping(path = "/employees") 
	  @RequestMapping(path = "/employees", method = RequestMethod.GET)
	  public ResponseEntity<List<Employee>> getEmployee() {
	  
		  List<Employee> employeelist=new ArrayList<Employee>(); 
		  
		 employeerepository.findAll().forEach(employeelist::add);;
		  
	  return  new ResponseEntity<List<Employee>>(employeelist,HttpStatus.OK);
			  
	  }
	
	@GetMapping(path = "/employees/{id}")
	public ResponseEntity<Employee> getEmployeeId(@PathVariable(value = "id") Long id) {

		Optional<Employee> employee = employeerepository.findById(id);

		if (employee.isPresent()) {
			return new ResponseEntity<>(employee.get(), HttpStatus.OK);
		}

		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping(path = "/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") long id,
			@RequestBody Employee employee) {

		Optional<Employee> emp1 = employeerepository.findById(id);

		if (emp1.isPresent()) {

			emp1.get().setName(employee.getName());
			emp1.get().setEmail(employee.getEmail());

			employeerepository.save(emp1.get());

			return new ResponseEntity<>(emp1.get(), HttpStatus.OK);
		}

		else {
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);

		}
	}

	@DeleteMapping(path = "/employees/{id}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable("id") Long id) {

		// Employee emp= employeerepository.getById(id);

		employeerepository.deleteById(id);
		return new ResponseEntity(HttpStatus.NO_CONTENT);

	}

	  
	 
}
