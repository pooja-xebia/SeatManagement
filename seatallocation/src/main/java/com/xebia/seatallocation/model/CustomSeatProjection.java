package com.xebia.seatallocation.model;

public interface CustomSeatProjection {
	
	String getEmpName();
	String getEmpId();
	String getSeatCd();
	boolean getIsOccupied();
	String getSeatId(); 
	
	String getRoomId();
	 
}
