package com.example.XebiaSeatAllocation.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public interface CustomSeatProjection {
	
	String getEmpName();
	String getEmpId();
	String getSeatCd();
	boolean getIsOccupied();
	String getSeatId(); 
	
	String getRoomId();
	 
	 
}
