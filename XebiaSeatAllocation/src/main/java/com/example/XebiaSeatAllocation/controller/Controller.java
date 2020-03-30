package com.example.XebiaSeatAllocation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.XebiaSeatAllocation.model.EmailDto;
import com.example.XebiaSeatAllocation.service.EmailService;


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
	    
	    @PostMapping(value = "/mailsend")
	    public String mailsend(@RequestBody EmailDto emailDto) {
	    	
	        emailService.sendMail(emailDto);

	        return "emailsent";
	    }

}
