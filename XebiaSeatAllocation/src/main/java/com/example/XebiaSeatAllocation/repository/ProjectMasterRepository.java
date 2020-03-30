package com.example.XebiaSeatAllocation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.XebiaSeatAllocation.model.ProjectMaster;


@Repository
public interface ProjectMasterRepository extends JpaRepository<ProjectMaster, Long> {

	ProjectMaster findByProjectId(Long projectMasterId);

}
