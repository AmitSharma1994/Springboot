package com.wipro.service;

import java.util.List;
import java.util.Optional;

import com.wipro.Exception.ResourceNotFound;
import com.wipro.entity.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee emp);

	List<Employee> GetAllEmployee();

	Optional<Employee> getEmployeebyID(long id) throws ResourceNotFound;

	Employee updteEmployee(Employee emp, long id);

	void deleteEmployee(long id);

	Optional<Employee> getEmployeebyName(String name);
}
