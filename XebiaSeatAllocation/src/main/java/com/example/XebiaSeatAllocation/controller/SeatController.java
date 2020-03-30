package com.example.XebiaSeatAllocation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.XebiaSeatAllocation.model.CustomSeatProjection;
import com.example.XebiaSeatAllocation.model.ProjectSeatMaster;
import com.example.XebiaSeatAllocation.model.SeatsMapped;
import com.example.XebiaSeatAllocation.repository.SeatAllocationRepository;
import com.example.XebiaSeatAllocation.service.SeatAllocationService;
import com.example.XebiaSeatAllocation.vo.SeatOccupancy;


@RestController
@RequestMapping("/seatalloc")
public class SeatController {
	
	@Autowired
	private SeatAllocationService seatAllocationService;
	
	@Autowired
	private SeatAllocationRepository seatAllocationRepository;
	
	@PostMapping("/allocateseat")
	public String allocateSeat(@RequestBody SeatsMapped seatMapped) {
		
		return seatAllocationService.allocateSeat(seatMapped);
				
	}
	
	@GetMapping("/getallseats/{roomId}")
	public List<CustomSeatProjection> getAllSeats(@PathVariable(name="roomId") Long roomId) {
		
		return seatAllocationService.getAllSeats(roomId);
				
	}
	
	@GetMapping("/getseatroomoccupancy/{roomId}")
	public SeatOccupancy getSeatRoomOccupancy(@PathVariable(name="roomId") Long roomId) {
		
		return seatAllocationService.getOccupancyDataForRoom(roomId);
				
	}
	
	@PostMapping("/deallocateseat")
	public ProjectSeatMaster deAllocateSeat(@RequestBody SeatsMapped seatMapped) {
		
		return seatAllocationService.deallocateSeat(seatMapped.getEmpId());
				
	}
	

	@GetMapping("/getseatinfo/{empId}")
	public SeatsMapped isAllocated(@PathVariable(name="empId") String empId) {
		return seatAllocationRepository.findByEmpId(empId);

				
	}

}
