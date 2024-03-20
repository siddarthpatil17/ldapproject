package com.example.sec.ldap.ApI.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.sec.ldap.ApI.dto.dtoclass;
import com.example.sec.ldap.ApI.repo.regrepo;

@Component
public class daoclass {

	@Autowired
	regrepo repo;
	
	public String insert(dtoclass dto)
	{
		repo.save(dto);
		return "inserdted";
	}
}
