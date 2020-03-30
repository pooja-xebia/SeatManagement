package com.example.XebiaSeatAllocation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.XebiaSeatAllocation.model.CustomSeatProjection;
import com.example.XebiaSeatAllocation.model.ProjectSeatMaster;
import com.example.XebiaSeatAllocation.model.SeatsMapped;
import com.example.XebiaSeatAllocation.vo.SeatOccupancy;


@Service
public interface SeatAllocationService {
	
	public String allocateSeat(SeatsMapped seatsMapped);

	public List<CustomSeatProjection> getAllSeats(Long roomId);
	
	public SeatOccupancy getOccupancyDataForRoom(Long roomId);
	
	public ProjectSeatMaster deallocateSeat(String empId);

	//public String deallocateSeat(SeatsMapped seatMapped);

}
