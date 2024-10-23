package com.wipro.controller;

import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import com.wipro.entity.Employee;
import com.wipro.service.EmployeeService;

public class EmployeeControllerTest {
	
	@InjectMocks
	EmployeeController employeeController;
	@Mock
	EmployeeService employeeService;

	
	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(employeeController); ////in order for Mock and InjectMocks annotations to take effect, you need to call MockitoAnnotations.openMocks(this);

	}
	
	@Test
	public void	getEmployee(){
		
		Employee emp=new Employee(1L,"ABC","emaiil.com");
		Employee emp2=new Employee(1L,"ABC","emaiil.com");
		
		List<Employee> list=Arrays.asList(emp,emp2);
		
		when(employeeService.GetAllEmployee()).thenReturn(list);
		
		ResponseEntity<List<Employee>> response=employeeController.getEmployee();
		
		
		
		
		
	}

}
