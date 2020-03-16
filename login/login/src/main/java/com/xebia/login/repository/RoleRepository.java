package com.xebia.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xebia.login.model.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {
	
	

}
