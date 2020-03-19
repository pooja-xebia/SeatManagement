package com.xebia.seatallocation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.xebia.seatallocation.model.ProjectSeatMaster;

@Repository
public interface SeatMasterRepository extends JpaRepository<ProjectSeatMaster, Long> {
	
	public ProjectSeatMaster findBySeatId(Long seatId);
	
	@Query("select count(seatId) from ProjectSeatMaster where roomId=:roomId")
	public int findTotalSeats(@Param("roomId") Long roomId);
	
	@Query("select count(seatId) from ProjectSeatMaster where roomId=:roomId and isOccupied=true")
	public int findOccupiedSeats(@Param("roomId") Long roomId);
	
 
	
	
	

}
