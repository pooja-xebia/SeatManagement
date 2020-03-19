package com.xebia.seatmanagementmaster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xebia.seatmanagementmaster.model.ProjectManagerMaster;
import com.xebia.seatmanagementmaster.model.ProjectMaster;
import com.xebia.seatmanagementmaster.model.ProjectRoomMaster;
import com.xebia.seatmanagementmaster.model.ProjectSeatMaster;
import com.xebia.seatmanagementmaster.repository.ProjectManagerMasterRepo;
import com.xebia.seatmanagementmaster.repository.ProjectMasterRepository;
import com.xebia.seatmanagementmaster.repository.ProjectRoomMasterRepository;
import com.xebia.seatmanagementmaster.service.ProjectSeatMasterService;
import com.xebia.seatmanagementmaster.utils.MasterUtil;

@RestController
@RequestMapping(MasterUtil.CONTROLLER_URL)
public class MasterController {
	
	@Autowired
	private ProjectSeatMasterService projectSeatMasterService;
	/*Seat Master Code Starts*/
	@PostMapping(MasterUtil.CREATE_PROJECT_SEAT)
	public ProjectSeatMaster createSeat(@RequestBody ProjectSeatMaster seatMaster) {
		
		return projectSeatMasterService.createProjectMaster(seatMaster);
	}
	
	@PutMapping(MasterUtil.UPDATE_PROJECT_SEAT)
	public ProjectSeatMaster updateSeat(@RequestBody ProjectSeatMaster seatMaster) {
		
		return projectSeatMasterService.createProjectMaster(seatMaster);
	}
	
	@GetMapping("getSeatByRoom/{roomId}")
	public List<ProjectSeatMaster> getSeatByRoom(@PathVariable(name="roomId") Long id) {
		return projectSeatMasterService.findSeatByRoomId(id);
	}
	
	@GetMapping(MasterUtil.VIEW_SEAT_BY_ID)
	public ProjectSeatMaster getSeatById(@PathVariable(name="id") Long seatId) {
		return projectSeatMasterService.findBySeatId(seatId);
	}
	
	
	/*Seat Master Code Ends*/
	
	/*Create Project*/
	@Autowired
	private ProjectMasterRepository projectMasterRepository;
	
	@PostMapping(MasterUtil.CREATE_PROJECT)
	public ProjectMaster createProject(@RequestBody ProjectMaster projectMaster) {
		
		return projectMasterRepository.save(projectMaster);
	}
	/*Create Project Ends*/
	
	/*Create Manager Master*/
	
	@Autowired
	private ProjectManagerMasterRepo projectManagerMasterRepository;
	
	@PostMapping(MasterUtil.CREATE_PROJECT_MANAGER)
	public ProjectManagerMaster createProjectManager(@RequestBody ProjectManagerMaster projectManagerMaster) {
		
		return projectManagerMasterRepository.save(projectManagerMaster);
	}
	/*Create Manager Master Ends*/
	
	/*Create Project Room  Master*/
	
	@Autowired
	private ProjectRoomMasterRepository projectRoomMasterRepository;
	
	@PostMapping(MasterUtil.CREATE_PROJECT_ROOM)
	public ProjectRoomMaster createProjectRoom(@RequestBody ProjectRoomMaster projectRoomMaster) {
		
		return projectRoomMasterRepository.save(projectRoomMaster);
	}
	/*Create Project Room Master Ends*/

}
