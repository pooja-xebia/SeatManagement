package com.example.Email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Email.service.EmailService;

@SpringBootApplication
public class EmailApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(EmailApplication.class, args);
		
		/*
		 * @Override public void run(String[] args)) {
		 * emailService.sendMail("manoj260191@gmail.com", "Hi", "Ho ho ho");
		 * 
		 * emailService.sendPreConfiguredMail("Ho ho ho"); }
		 */
	}

}
