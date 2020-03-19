package com.xebia.seatmanagementmaster.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="PROJECT_SEAT_MASTER")
public class ProjectSeatMaster {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long seatId;
	
	private Long roomId;
	
	private String seatCd;
	
	private boolean isOccupied;
	
	public Long getSeatId() {
		return seatId;
	}

	public void setSeatId(Long seatId) {
		this.seatId = seatId;
	}

	public Long getRoomId() {
		return roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	public String getSeatCd() {
		return seatCd;
	}

	public void setSeatCd(String seatCd) {
		this.seatCd = seatCd;
	}

	public boolean isOccupied() {
		return isOccupied;
	}

	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}

}
