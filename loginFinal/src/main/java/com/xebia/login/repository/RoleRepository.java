package com.xebia.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xebia.login.entity.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);

    @Override
    void delete(Role role);

}
