package com.xebia.seatmanagementmaster.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.xebia.seatmanagementmaster.model.ProjectMaster;
import com.xebia.seatmanagementmaster.repository.ProjectMasterRepository;

public class MasterDetailServiceImpl implements ProjectMasterDetailService{

	@Autowired
	private ProjectMasterRepository projectMasterRepository;
	
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

}
