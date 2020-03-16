package com.xebia.seatallocation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.xebia.seatallocation.model.CustomSeatProjection;
import com.xebia.seatallocation.model.ProjectSeatMaster;
import com.xebia.seatallocation.model.SeatsMapped;
import com.xebia.seatallocation.vo.SeatOccupancy;

@Service
public interface SeatAllocationService {
	
	public String allocateSeat(SeatsMapped seatsMapped);

	public List<CustomSeatProjection> getAllSeats(Long roomId);
	
	public SeatOccupancy getOccupancyDataForRoom(Long roomId);
	
	public ProjectSeatMaster deallocateSeat(String empId);

	//public String deallocateSeat(SeatsMapped seatMapped);

}
