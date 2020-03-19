package com.xebia.seatmanagementmaster.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.xebia.seatmanagementmaster.model.ProjectSeatMaster;


@Service
public interface ProjectSeatMasterService {

	public ProjectSeatMaster createProjectMaster(ProjectSeatMaster projectMaster);

	public ProjectSeatMaster updateProjectMaster(ProjectSeatMaster projectMaster);

	public void deleteProjectMaster(Long projectSeatMasterId);

	public List<ProjectSeatMaster> findAllProjectSeatMaster();
	
	public List<ProjectSeatMaster> findSeatByRoomId(Long roomId);

	ProjectSeatMaster findBySeatId(Long seatId);

}
