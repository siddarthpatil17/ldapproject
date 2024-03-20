package com.example.sec.ldap.ApI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

//import com.example.sec.ldap.ApI.dto.dtoclass;

@SpringBootApplication
public class SpringLdapSecApplication {
	@Autowired
	private com.example.sec.ldap.ApI.controller.mailsenderservice mailsenderservice;

	public static void main(String[] args) {
		SpringApplication.run(SpringLdapSecApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class )
	public void sendMail()
	{
//		String mail = dtoclass.getEmail() ;
		mailsenderservice.sendMail( "sendermail", "subject ", "body");
	}

}
