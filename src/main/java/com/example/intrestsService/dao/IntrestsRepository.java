package com.example.intrestsService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.intrestsService.model.Intrest;
@Repository
public interface IntrestsRepository extends JpaRepository<Intrest, String> {
	Intrest findByUserName(String userName);

}
