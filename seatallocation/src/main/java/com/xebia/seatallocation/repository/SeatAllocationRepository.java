package com.xebia.seatallocation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.xebia.seatallocation.model.CustomSeatProjection;
import com.xebia.seatallocation.model.SeatsMapped;

@Repository
public interface SeatAllocationRepository extends JpaRepository<SeatsMapped, Long> {
	
	@Query("select distinct psm.seatCd as seatCd,psm.roomId as roomId,psm.isOccupied as isOccupied,psm.seatId as seatId,sm.empName as empName, sm.empId as empId from ProjectSeatMaster psm left join SeatsMapped sm on psm.seatId = sm.seatId "
			+ "where psm.roomId=:roomId order by psm.seatCd")
	public List<CustomSeatProjection> findSeatAndEmployee(@Param("roomId") Long roomId);
	
	public SeatsMapped findByEmpId(String empId);

}
