package com.example.sec.ldap.ApI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


import com.example.sec.ldap.ApI.dao.daoclass;
import com.example.sec.ldap.ApI.dto.dtoclass;

@Service
public class Serviceclass {
	@Autowired
	daoclass dao;
	public String insert(@RequestBody dtoclass dto)
	{
		return  dao.insert(dto);
	}

}
