package com.example.XebiaSeatAllocation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PROJECT_ROOM_MASTER")
public class ProjectRoomMaster {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long roomId;
	
	private Long floorNo;
	
	private String countryCd;
	
	private Long managerId;
	
	private String officeId;
	
	private String city;
	
	private Long projectId;
	
	private Long totalCapacity;
	
	private String projectRoomName;
	
	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public Long getRoomId() {
		return roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	public Long getFloorNo() {
		return floorNo;
	}

	public void setFloorNo(Long floorNo) {
		this.floorNo = floorNo;
	}

	public String getCountryCd() {
		return countryCd;
	}

	public void setCountryCd(String countryCd) {
		this.countryCd = countryCd;
	}

	public Long getManagerId() {
		return managerId;
	}

	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}

	public String getOfficeId() {
		return officeId;
	}

	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getTotalCapacity() {
		return totalCapacity;
	}

	public void setTotalCapacity(Long totalCapacity) {
		this.totalCapacity = totalCapacity;
	}

	public String getProjectRoomName() {
		return projectRoomName;
	}

	public void setProjectRoomName(String projectRoomName) {
		this.projectRoomName = projectRoomName;
	}


}
