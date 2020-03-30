package com.example.XebiaSeatAllocation.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.XebiaSeatAllocation.model.ProjectMaster;
import com.example.XebiaSeatAllocation.model.ProjectSeatMaster;
import com.example.XebiaSeatAllocation.repository.ProjectMasterRepository;
import com.example.XebiaSeatAllocation.repository.SeatMasterRepository;
import com.example.XebiaSeatAllocation.vo.SeatUtilization;



public class MasterDetailServiceImpl implements ProjectMasterDetailService{

	@Autowired
	private ProjectMasterRepository projectMasterRepository;
	
	@Autowired
	private SeatMasterRepository seatMasterRepository;

	
	@Override
	public ProjectMaster createProjectMaster(ProjectMaster projectMaster) {
		// TODO Auto-generated method stub
		return projectMasterRepository.save(projectMaster);
	}

	@Override
	public ProjectMaster updateProjectMaster(ProjectMaster projectMaster) {
		// TODO Auto-generated method stub
		return projectMasterRepository.save(projectMaster);
	}

	@Override
	public void deleteProjectMaster(Long projectMasterId) {
		// TODO Auto-generated method stub
		ProjectMaster projectMaster=projectMasterRepository.findByProjectId(projectMasterId);
		projectMasterRepository.delete(projectMaster);
	}

	@Override
	public List<ProjectMaster> findAllProjectMaster() {
		// TODO Auto-generated method stub
		return projectMasterRepository.findAll();
	}

	@Override
	public ProjectMaster findProjectMaster(Long projectMasterId) {
		// TODO Auto-generated method stub
		return projectMasterRepository.findByProjectId(projectMasterId);
	}
	
	@Override
	public List<SeatUtilization> calculateSeatUtilization(Long projectRoomId) {
		// TODO Auto-generated method stub
		List<SeatUtilization> seatUtilization=new ArrayList<>();
		List<ProjectSeatMaster> seatMaster=seatMasterRepository.findAll();
		return seatUtilization;
	}

}
