package com.xebia.seatallocation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xebia.seatallocation.model.ProjectSeatMaster;

@Repository
public interface SeatMasterRepository extends JpaRepository<ProjectSeatMaster, Long> {
	
	public ProjectSeatMaster findBySeatId(Long seatId);
	
	
	

}
