package com.example.XebiaSeatAllocation.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.XebiaSeatAllocation.model.ProjectManagerMaster;
import com.example.XebiaSeatAllocation.model.ProjectMaster;
import com.example.XebiaSeatAllocation.model.ProjectRoomMaster;
import com.example.XebiaSeatAllocation.model.ProjectSeatMaster;
import com.example.XebiaSeatAllocation.repository.ProjectManagerMasterRepo;
import com.example.XebiaSeatAllocation.repository.ProjectMasterRepository;
import com.example.XebiaSeatAllocation.repository.ProjectRoomMasterRepository;
import com.example.XebiaSeatAllocation.service.ProjectSeatMasterService;
import com.example.XebiaSeatAllocation.utils.*;
import com.example.XebiaSeatAllocation.vo.SeatUtilization;

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
	
	@GetMapping("getRoomByProjectId/{projectId}")
	public List<ProjectRoomMaster> getRoomByProjectId(@PathVariable(name="projectId") Long id) {
		return projectRoomMasterRepository.findByProjectId(id);
	}
	
	/*Get all projects*/
	@GetMapping("getAllProjects")
	public List<ProjectMaster> getAllProjects(){
		
		return projectMasterRepository.findAll();
		
	}
	
	/*Get all Project Rooms*/
	@GetMapping("getAllProjectRooms")
	public List<ProjectRoomMaster> getAllProjectRooms(){
		
		return projectRoomMasterRepository.findAll();
		
	}
	
	//Get Seat Utilization
	@GetMapping("getUtilization/{roomId}")
	public List<SeatUtilization> getSeatUtilization(@PathVariable(name="roomId") Long roomId){
		List<SeatUtilization> seatUtilization=new ArrayList<>();
		return seatUtilization;
		
	}
}
