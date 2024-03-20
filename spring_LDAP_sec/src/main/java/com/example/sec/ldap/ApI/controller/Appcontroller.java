package com.example.sec.ldap.ApI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sec.ldap.ApI.dto.dtoclass;
import com.example.sec.ldap.ApI.service.Serviceclass;

@RestController
@RequestMapping("/rest")
public class Appcontroller {

	@Autowired
	Serviceclass service;
	
	@RequestMapping("/reg")
	public String registrationhtml()
	{
		return "Registration";
	}

	@PostMapping("/registrationForm")
	@ResponseBody
	public String insertCourse(@ModelAttribute dtoclass dto)
	{
		return service.insert( dto);
	}
}
