package com.example.XebiaSeatAllocation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.XebiaSeatAllocation.model.ProjectManagerMaster;


@Repository
public interface ProjectManagerMasterRepo extends JpaRepository<ProjectManagerMaster, Long> {

}
