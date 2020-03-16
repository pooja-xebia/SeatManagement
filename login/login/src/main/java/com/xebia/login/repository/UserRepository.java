package com.xebia.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xebia.login.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);
    User findByUsernameOrEmail(String username, String email);
    
	

}
