package com.wipro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.entity.Employee;
import com.wipro.repository.EmployeeRepository;

@Service
public class EmployeeServiceIml implements EmployeeService {

	@Autowired
	EmployeeRepository employeerepository;

	@Override
	public Employee saveEmployee(Employee emp) {

		return employeerepository.save(emp);
	}

	@Override
	public List<Employee> GetAllEmployee() {

		return employeerepository.findAll();
	}

	@Override
	public Optional<Employee> getEmployeebyID(long id) {

		return employeerepository.findById(id);
	}

	@Override
	public Employee updteEmployee(Employee emp,long id) {

		Optional<Employee> emp1 = employeerepository.findById(id);

		if (emp1.isPresent()) {

			emp1.get().setName(emp.getName());
			emp1.get().setEmail(emp.getEmail());
		}

		return employeerepository.save(emp1.get());
	}

	@Override
	public void deleteEmployee(long id) {
		
		employeerepository.deleteById(id);
		
	}

	
}
