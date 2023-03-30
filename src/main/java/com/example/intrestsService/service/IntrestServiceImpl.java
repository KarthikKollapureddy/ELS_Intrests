package com.example.intrestsService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.intrestsService.dao.IntrestsRepository;
import com.example.intrestsService.exception.UserNameNotFoundException;
import com.example.intrestsService.model.Intrest;

@Service
public class IntrestServiceImpl implements IntrestService{
	
	@Autowired
	private IntrestsRepository intrestsRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Intrest addIntrests(Intrest intrests) throws UserNameNotFoundException  {
		String userName = restTemplate.getForEntity("http://localhost:9090/elearning/api/na/"+intrests.getUserName(),String.class).getBody();
		if(userName == null) {
			throw new UserNameNotFoundException();
					
		}
		else {
			return intrestsRepository.save(intrests);
		}
	}

	@Override
	public Intrest getIntrest(String userName) throws UserNameNotFoundException {
		if(restTemplate.getForEntity("http://localhost:9090/elearning/api/na/"+userName,String.class).getBody()==null) {
			throw new UserNameNotFoundException();
			
		}
		return intrestsRepository.findByUserName(userName);
	}
	
	
	
	

}
