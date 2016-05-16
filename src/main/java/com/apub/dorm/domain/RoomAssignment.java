package com.apub.dorm.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RoomAssignment {
	private Integer id;
	private Integer studentId;
	private String email;
	private String entryDate;
	private Integer buildingNo;
	private Integer roomNo;
	
	public RoomAssignment() {
		
	}

	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getBuildingNo() {
		return buildingNo;
	}

	public void setBuildingNo(Integer buildingNo) {
		this.buildingNo = buildingNo;
	}

	public Integer getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(Integer roomNo) {
		this.roomNo = roomNo;
	}

	public String getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}

	@Override
	public String toString() {
		return "RoomAssignment [id=" + id + ", studentId=" + studentId + ", email=" + email + ", date=" + entryDate
				+ ", buildingNo=" + buildingNo + ", roomNo=" + roomNo + "]";
	}
	

}
