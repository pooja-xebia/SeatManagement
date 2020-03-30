package com.example.XebiaSeatAllocation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.XebiaSeatAllocation.model.EmailDto;


@Service("emailService")
public class EmailService 
{
    @Autowired
    private JavaMailSender mailSender;
      
    @Autowired
    private SimpleMailMessage preConfiguredMessage;
  
    /**
     * This method will send compose and send the message 
     * */
    public void sendMail(String to, String subject, String body) 
    {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);
        mailSender.send(message);
    }
  
    /**
     * This method will send a pre-configured message
     * */
    public void sendPreConfiguredMail(String message) 
    {
        SimpleMailMessage mailMessage = new SimpleMailMessage(preConfiguredMessage);
        mailMessage.setText(message);
        mailSender.send(mailMessage);
    }

	public void sendMail(EmailDto emailDto) {
		SimpleMailMessage message = new SimpleMailMessage();

		StringBuilder sbMessage = new StringBuilder();
		sbMessage.append("Hi ").append(emailDto.getEmpName()).append(", \n\n").append(emailDto.getMsg() + ".")
				.append(" \n\n\n").append("Thanks & Regards, \n").append("Xebia Admin");

		message.setTo(emailDto.getEmailAddress());
		message.setSubject("Seat Allocation");
		message.setText(sbMessage.toString());
		mailSender.send(message);

	}

}
