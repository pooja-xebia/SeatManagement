package com.example.XebiaSeatAllocation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.XebiaSeatAllocation.model.Role;



public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);

    @Override
    void delete(Role role);

}
