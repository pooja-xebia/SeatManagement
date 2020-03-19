package com.xebia.seatallocation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xebia.seatallocation.model.CustomSeatProjection;
import com.xebia.seatallocation.model.ProjectSeatMaster;
import com.xebia.seatallocation.model.SeatsMapped;

import com.xebia.seatallocation.service.SeatAllocationService;
import com.xebia.seatallocation.vo.SeatOccupancy;

@RestController
@RequestMapping("/seatalloc")
public class SeatController {
	
	@Autowired
	private SeatAllocationService seatAllocationService;
	
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

}
