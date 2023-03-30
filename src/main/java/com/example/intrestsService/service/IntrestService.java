package com.example.intrestsService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.intrestsService.exception.UserNameNotFoundException;
import com.example.intrestsService.model.Intrest;



@Service
public interface IntrestService {
	Intrest addIntrests(Intrest intrests) throws UserNameNotFoundException;
	
	Intrest getIntrest(String userName) throws UserNameNotFoundException;
}
