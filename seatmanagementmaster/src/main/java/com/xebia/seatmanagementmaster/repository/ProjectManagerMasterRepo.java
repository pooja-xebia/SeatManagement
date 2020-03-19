package com.xebia.seatmanagementmaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xebia.seatmanagementmaster.model.ProjectManagerMaster;

@Repository
public interface ProjectManagerMasterRepo extends JpaRepository<ProjectManagerMaster, Long> {

}
