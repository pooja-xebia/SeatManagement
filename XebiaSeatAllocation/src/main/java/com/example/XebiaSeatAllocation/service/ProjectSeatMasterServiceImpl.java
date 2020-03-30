package com.example.XebiaSeatAllocation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.XebiaSeatAllocation.model.ProjectSeatMaster;
import com.example.XebiaSeatAllocation.repository.ProjectSeatMasterRepository;


@Service
public class ProjectSeatMasterServiceImpl implements ProjectSeatMasterService {

	@Autowired
	private ProjectSeatMasterRepository projectSeatMasterRepository;
	
	@Override
	public ProjectSeatMaster createProjectMaster(ProjectSeatMaster seatMaster) {
		// TODO Auto-generated method stub
		return projectSeatMasterRepository.save(seatMaster);
	}

	@Override
	public ProjectSeatMaster updateProjectMaster(ProjectSeatMaster seatMaster) {
		// TODO Auto-generated method stub
		return projectSeatMasterRepository.save(seatMaster);
	}

	@Override
	public void deleteProjectMaster(Long seatId) {
		// TODO Auto-generated method stub
		ProjectSeatMaster seatMaster=projectSeatMasterRepository.findBySeatId(seatId);
		projectSeatMasterRepository.delete(seatMaster);

	}

	@Override
	public List<ProjectSeatMaster> findAllProjectSeatMaster() {
		// TODO Auto-generated method stub
		return projectSeatMasterRepository.findAll();
	}

	@Override
	public ProjectSeatMaster findBySeatId(Long seatId) {
		// TODO Auto-generated method stub
		return projectSeatMasterRepository.findBySeatId(seatId);
	}
	
	@Override
	public List<ProjectSeatMaster> findSeatByRoomId(Long roomId) {
		// TODO Auto-generated method stub
		return projectSeatMasterRepository.findByRoomId(roomId);
	}

}
