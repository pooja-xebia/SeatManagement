package com.example.Email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Email.service.EmailService;

@RestController
@RequestMapping("mailsender")
public class Controller {

	    @Autowired
	    private EmailService emailService;

	    @GetMapping(value = "/sendmail")
	    public String sendmail() {

	        emailService.sendMail("pooja.pandey@xebia.com", "Test Subject", "Test mail");

	        return "emailsent";
	    }

}
