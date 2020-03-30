package com.example.XebiaSeatAllocation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.XebiaSeatAllocation.model.ProjectRoomMaster;


@Repository
public interface ProjectRoomMasterRepository extends JpaRepository<ProjectRoomMaster, Long> {
	List<ProjectRoomMaster> findByProjectId(Long projectId);


}
