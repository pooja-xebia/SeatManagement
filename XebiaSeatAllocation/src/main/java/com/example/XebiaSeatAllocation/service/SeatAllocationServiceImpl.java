package com.example.XebiaSeatAllocation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.XebiaSeatAllocation.model.CustomSeatProjection;
import com.example.XebiaSeatAllocation.model.ProjectSeatMaster;
import com.example.XebiaSeatAllocation.model.SeatsMapped;
import com.example.XebiaSeatAllocation.repository.SeatAllocationRepository;
import com.example.XebiaSeatAllocation.repository.SeatMasterRepository;
import com.example.XebiaSeatAllocation.vo.SeatOccupancy;

import io.swagger.models.Response;

@Service
public class SeatAllocationServiceImpl implements SeatAllocationService {

	@Autowired
	private SeatAllocationRepository seatAllocationRepository;

	@Autowired
	private SeatOccupancy seatOccupancy;

	@Autowired
	private SeatMasterRepository seatMasterRepository;

	private SeatsMapped seatsMapped;
	
	private ProjectSeatMaster seatMaster;

	@Override
	public String allocateSeat(SeatsMapped seatMapped) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		boolean check = false;
		ProjectSeatMaster seatMaster = seatMasterRepository.findBySeatId(seatMapped.getSeatId());
		if (!seatMaster.isOccupied()) {
			seatsMapped = seatAllocationRepository.save(seatMapped);
			check = true;
		}
		if (null != seatsMapped) {

			seatMaster.setUpdatedAt(seatMapped.getCreatedAt());
			seatMaster.setOccupied(true);
			seatMasterRepository.save(seatMaster);

		} else {
			sb.append(" Unable to allocate seat ");
		}
		if (seatMasterRepository.findBySeatId(seatMapped.getSeatId()).isOccupied() && check) {
			sb.append("Seat Allocated to the Employee Name: ").append(seatMapped.getEmpName()).append(" Is ")
					.append(seatMaster.getSeatCd()).append(" Location as ").append(seatMapped.getCity());
		}
		return sb.toString();

	}

	@Override
	public List<CustomSeatProjection> getAllSeats(Long roomId) {
		// TODO Auto-generated method stub
		return seatAllocationRepository.findSeatAndEmployee(roomId);
	}

	@Override
	public SeatOccupancy getOccupancyDataForRoom(Long roomId) {
		// TODO Auto-generated method stub
		int occupiedSeats = seatMasterRepository.findOccupiedSeats(roomId);
		int totalSeats = seatMasterRepository.findTotalSeats(roomId);
		int vacantSeats = totalSeats - occupiedSeats;

		seatOccupancy.setTotalSeats(totalSeats);
		seatOccupancy.setOccupiedSeats(occupiedSeats);
		seatOccupancy.setUnOccupiedSeats(vacantSeats);

		return seatOccupancy;
	}

	@Override
	public ProjectSeatMaster deallocateSeat(String empId) {
		// TODO Auto-generated method stub
		seatsMapped=seatAllocationRepository.findByEmpId(empId);
		seatAllocationRepository.delete(seatsMapped);
		seatMaster=seatMasterRepository.findBySeatId(seatsMapped.getSeatId());
		seatMaster.setOccupied(false);
		seatMaster=seatMasterRepository.save(seatMaster);
		return seatMaster;
	}
}
