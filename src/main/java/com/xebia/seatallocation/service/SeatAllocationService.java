package com.xebia.seatallocation.service;

import org.springframework.stereotype.Service;

import com.xebia.seatallocation.model.SeatsMapped;

@Service
public interface SeatAllocationService {
	
	public String allocateSeat(SeatsMapped seatsMapped);

}
