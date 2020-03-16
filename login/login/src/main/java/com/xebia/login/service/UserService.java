package com.xebia.login.service;

import com.xebia.login.model.User;

public interface UserService {
	
	 void save(User user);

	    User findByUsername(String username);

		public User createUser(User user);

}
