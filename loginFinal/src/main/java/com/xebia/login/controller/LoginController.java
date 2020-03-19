package com.xebia.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xebia.login.entity.User;
import com.xebia.login.exception.EmailExistsException;
import com.xebia.login.exception.UserAlreadyExistException;
import com.xebia.login.repository.UserRepository;
import com.xebia.login.service.UserService;

@RestController
@RequestMapping("/app")
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
    private UserRepository userRepository;
	
	@PostMapping("/login")
	public String validateUser(@RequestBody User user) throws Exception {
		
		User userFound=userRepository.findByEmail(user.getEmail());
		if(null !=userFound)
		{
			if(userFound.getPassword().equals(user.getPassword())) {
				return "authincated user & role is "+user.getRoles();
				
			}else
			{
				throw new Exception(" Password does not match");
			}
		}else
		{
			throw new Exception(" User not exist");
		}
		
	}
	
	@PostMapping("/register")
	public User registerUser(@RequestBody User user) throws EmailExistsException,UserAlreadyExistException {
		
	        return userService.registerNewUserAccount(user);
	   
	}
	


}
