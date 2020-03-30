package com.example.XebiaSeatAllocation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.XebiaSeatAllocation.model.Privilege;



public interface PrivilegeRepository  extends JpaRepository<Privilege, Long> {

    Privilege findByName(String name);

    @Override
    void delete(Privilege privilege);

}
