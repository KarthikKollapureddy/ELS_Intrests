package com.example.intrestsService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.intrestsService.exception.UserNameNotFoundException;
import com.example.intrestsService.model.Intrest;
import com.example.intrestsService.service.IntrestService;



@RestController
@RequestMapping("elearning/api/intrest")
@CrossOrigin(origins = "*")
public class IntrestsController {
	
	@Autowired
	private IntrestService intrestService;
	
	@PostMapping()
	public ResponseEntity<Intrest> addIntrests(@RequestBody Intrest intrest) throws UserNameNotFoundException{
		return new ResponseEntity<Intrest>(intrestService.addIntrests(intrest),HttpStatus.OK);
		
	}
	@GetMapping("{userName}")
	public ResponseEntity<Intrest> getIntrests(@PathVariable String userName) throws UserNameNotFoundException{
		return new ResponseEntity<Intrest>(intrestService.getIntrest(userName),HttpStatus.OK);
	}

}
