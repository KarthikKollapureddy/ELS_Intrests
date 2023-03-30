package com.example.intrestsService.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@AllArgsConstructor
//@NoArgsConstructor
@Data

@Entity
public class Intrest {
	@Id
	private String userName;
	private String intrest1;
	private String intrest2;
	private String intrest3;
	

	
	

}
