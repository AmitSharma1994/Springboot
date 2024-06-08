package com.wipro.global.exception;

import java.util.InputMismatchException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.wipro.Exception.ResourceNotFound;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFound.class)
     ResponseEntity<String> 	handleResourceNotFoundException(ResourceNotFound ex){
		System.out.println("exception called");
    	return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
	}
	
	@ExceptionHandler(InputMismatchException.class)
	
   public ResponseEntity<String> handleInputMismatchException(InputMismatchException ex){
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
	}
	
}
