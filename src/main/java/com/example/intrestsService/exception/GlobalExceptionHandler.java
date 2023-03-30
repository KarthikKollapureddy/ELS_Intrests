package com.example.intrestsService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Component
@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(UserNameNotFoundException.class)
	public ResponseEntity<String> usernameNotFound(){
		return new ResponseEntity<String>("User name not found",HttpStatus.BAD_REQUEST);
	}
}
