package com.xebia.seatallocation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xebia.seatallocation.model.SeatsMapped;

import com.xebia.seatallocation.service.SeatAllocationService;

@RestController
@RequestMapping("/seatalloc")
public class SeatController {
	
	@Autowired
	private SeatAllocationService seatAllocationService;
	
	@PostMapping("/allocateseat")
	public String allocateSeat(@RequestBody SeatsMapped seatMapped) {
		
		return seatAllocationService.allocateSeat(seatMapped);
		
		
	}

}
