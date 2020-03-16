package com.xebia.login.service;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetails;

import com.xebia.login.model.User;

public interface UserDetailsService {
	 public  UserDetails loadUserByUsername(String username);
	 //public void configureGlobal(AuthenticationManagerBuilder auth);

}
