package com.example.sec.ldap.ApI.controller;

import org.apache.logging.log4j.message.SimpleMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class mailsenderservice {
	@Autowired
	private JavaMailSender mailSender;
	
	public void sendMail(String tomail, String subj,String body)
	{
		SimpleMailMessage message =new SimpleMailMessage();
		message.setFrom("siddarthpatil17@gmail.com");
		message.setTo(tomail);
		message.setText(body);
		message.setSubject(subj);
		
		mailSender.send(message);
		System.out.println("sent successefully");
				
	}

}
