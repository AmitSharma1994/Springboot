package com.wipro.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.entity.Student;
import com.wipro.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	StudentRepository studentRepository;
	
	@PostMapping("/registration")
	public ResponseEntity<Student> save( @Valid @RequestBody Student student){
		
	Student st=	studentRepository.save(student);
	
	
	return new ResponseEntity<Student>(st,  HttpStatus.CREATED);
	
	}
}
