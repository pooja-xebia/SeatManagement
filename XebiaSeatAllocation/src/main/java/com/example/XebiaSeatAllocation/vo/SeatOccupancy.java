package com.example.XebiaSeatAllocation.vo;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class SeatOccupancy implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 7665806950613787240L;

	private int totalSeats;
	
	private int occupiedSeats;
	
	private int unOccupiedSeats;
	
	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public int getOccupiedSeats() {
		return occupiedSeats;
	}

	public void setOccupiedSeats(int occupiedSeats) {
		this.occupiedSeats = occupiedSeats;
	}

	public int getUnOccupiedSeats() {
		return unOccupiedSeats;
	}

	public void setUnOccupiedSeats(int unOccupiedSeats) {
		this.unOccupiedSeats = unOccupiedSeats;
	}

}
