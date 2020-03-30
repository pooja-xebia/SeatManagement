package com.example.XebiaSeatAllocation.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="PROJECT_SEAT_MASTER")
public class ProjectSeatMaster {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long seatId;
	
	private Long roomId;
	
	private String seatCd;
	
	private boolean isOccupied;
	
	@Temporal(value = TemporalType.TIMESTAMP)
    private Date createdAt; 
	

	@Temporal(value = TemporalType.TIMESTAMP)
    private Date updatedAt; 
	
	
	public Long getSeatId() {
		return seatId;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
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
	

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
