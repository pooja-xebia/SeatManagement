package com.xebia.seatallocation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xebia.seatallocation.model.ProjectSeatMaster;
import com.xebia.seatallocation.model.SeatsMapped;
import com.xebia.seatallocation.repository.SeatAllocationRepository;
import com.xebia.seatallocation.repository.SeatMasterRepository;

@Service
public class SeatAllocationServiceImpl implements SeatAllocationService {
	
	@Autowired
	private SeatAllocationRepository seatAllocationRepository;
	
	@Autowired
	private SeatMasterRepository seatMasterRepository;
	
	private SeatsMapped seatsMapped;

	@Override
	public String allocateSeat(SeatsMapped seatMapped) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		boolean check=false;
		ProjectSeatMaster seatMaster=seatMasterRepository.findBySeatId(seatMapped.getSeatId());
		if(!seatMaster.isOccupied()) {
		seatsMapped=seatAllocationRepository.save(seatMapped);
		check=true;
		}
		if(null!=seatsMapped) {
			
			seatMaster.setOccupied(true);
			seatMasterRepository.save(seatMaster);
			
		} else
		{
			sb.append(" Unable to allocate seat ");
		}
		if(seatMasterRepository.findBySeatId(seatMapped.getSeatId()).isOccupied() && check) {
			sb.append("Seat Allocated to ").append(seatMapped.getEmpName()).append(
					"Is ").append(seatMaster.getSeatCd());
		}
		return sb.toString();
			
	}

}
