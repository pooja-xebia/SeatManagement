package com.example.XebiaSeatAllocation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;

@Configuration
public class EmailConfig {
	 @Bean
	    public SimpleMailMessage emailTemplate()
	    {
	        SimpleMailMessage message = new SimpleMailMessage();
	        message.setTo("pooja.pandey@xebia.com");
	        message.setFrom("pooja65385@gmail.com");
	        message.setSubject("Important email");
	        message.setText("Hello, how are you ?");
	        return message;
	    }

}
