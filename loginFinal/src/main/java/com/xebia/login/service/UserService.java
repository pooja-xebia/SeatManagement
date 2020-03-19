package com.xebia.login.service;

import java.util.Arrays;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xebia.login.entity.User;
import com.xebia.login.repository.RoleRepository;
import com.xebia.login.repository.UserRepository;
import com.xebia.login.exception.EmailExistsException;

@Service
public class UserService {
	
	 @Autowired
	    private UserRepository userRepository;

	/*
	 * @Autowired private PasswordEncoder passwordEncoder;
	 */
	    @Autowired
	    private RoleRepository roleRepository;

	/*
	 * @Autowired private SessionRegistry sessionRegistry;
	 */
	 

	 @Transactional
	    public User registerNewUserAccount(User accountDto) throws EmailExistsException{
	         
		 if (emailExists(accountDto.getEmail())) {   
	            throw new EmailExistsException("There is an account with that email adress: " + accountDto.getEmail());

	        }
		/*
		 * User user = new User(); user.setFirstName(accountDto.getFirstName());
		 * user.setLastName(accountDto.getLastName());
		 * user.setPassword(accountDto.getPassword());
		 * user.setEmail(accountDto.getEmail());
		 */
		 	accountDto.setRoles(Arrays.asList(roleRepository.findByName("ROLE_USER")));
	        return userRepository.save(accountDto);      
	    }
	    private boolean emailExists(String email) {
	        User user = userRepository.findByEmail(email);
	        if (user != null) {
	            return true;
	        }
	        return false;
	    }
	 

}
