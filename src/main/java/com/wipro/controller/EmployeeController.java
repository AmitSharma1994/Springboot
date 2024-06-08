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

import com.wipro.Exception.ResourceNotFound;
import com.wipro.entity.Employee;
import com.wipro.repository.EmployeeRepository;
import com.wipro.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired

	EmployeeService employeeService;

	@PostMapping("/employees")

	// @RequestMapping(path = "/employees", method = RequestMethod.POST)

	public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp) {

		// Employee emp1 = employeerepository.save(emp);

		Employee emp1 = employeeService.saveEmployee(emp);

		return new ResponseEntity<Employee>(emp1, HttpStatus.CREATED);
	}

	@GetMapping(path = "/employees")
	// @RequestMapping(path = "/employees", method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> getEmployee() {

		List<Employee> employeelist = employeeService.GetAllEmployee();

		/*
		 * List<Employee> employeelist = new ArrayList<Employee>();
		 * 
		 * employeerepository.findAll().forEach(employeelist::add); ;
		 */
		return new ResponseEntity<List<Employee>>(employeelist, HttpStatus.OK);

	}

	@GetMapping(path = "/employees/{id}")
	public ResponseEntity<Employee> getEmployeeId(@PathVariable(value = "id") Long id) throws ResourceNotFound {

		Optional<Employee> employee = employeeService.getEmployeebyID(id);

		/*
		 * Optional<Employee> employee = employeerepository.findById(id);
		 * 
		 * if (employee.isPresent()) { return new ResponseEntity<>(employee.get(),
		 * HttpStatus.OK); }
		 * 
		 * else { return new ResponseEntity<>(HttpStatus.NOT_FOUND); }
		 */
		return new ResponseEntity<Employee>(employee.get(), HttpStatus.OK);
	}

	@GetMapping(path = "/employeesname/{name}")
	public ResponseEntity<Employee> getEmployeeName(@PathVariable(value = "name") String name) {

		Optional<Employee> employee = employeeService.getEmployeebyName(name);

		/*
		 * Optional<Employee> employee = employeerepository.findById(id);
		 * 
		 * if (employee.isPresent()) { return new ResponseEntity<>(employee.get(),
		 * HttpStatus.OK); }
		 * 
		 * else { return new ResponseEntity<>(HttpStatus.NOT_FOUND); }
		 */
		return new ResponseEntity<Employee>(employee.get(), HttpStatus.OK);
	}

	@PutMapping(path = "/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") long id,
			@RequestBody Employee employee) {

		Employee emp = employeeService.updteEmployee(employee, id);

		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
	}

	@DeleteMapping(path = "/employees/{id}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable("id") Long id) {

		// Employee emp= employeerepository.getById(id);
		// employeerepository.deleteById(id);

		employeeService.deleteEmployee(id);

		return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);

	}

}
