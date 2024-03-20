package com.example.sec.ldap.ApI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class Appcontr {
	@GetMapping("/sec")
	public String Secure()
	{
	return "end point"; 
	}

}
