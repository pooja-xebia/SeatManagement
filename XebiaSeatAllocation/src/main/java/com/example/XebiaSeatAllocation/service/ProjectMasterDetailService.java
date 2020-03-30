package com.example.XebiaSeatAllocation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.XebiaSeatAllocation.model.ProjectMaster;
import com.example.XebiaSeatAllocation.vo.SeatUtilization;


@Service
public interface ProjectMasterDetailService {
	
	public ProjectMaster createProjectMaster(ProjectMaster projectMaster);
	
	public ProjectMaster updateProjectMaster(ProjectMaster projectMaster);
	
	public void deleteProjectMaster(Long  projectMasterId);
	
	public List<ProjectMaster> findAllProjectMaster();
	
	public ProjectMaster findProjectMaster(Long projectMasterId);
	
	public List<SeatUtilization> calculateSeatUtilization(Long projectRoomId);

}
