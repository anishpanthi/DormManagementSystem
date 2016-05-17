package com.apub.dorm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Anish Panthi
 */
@Entity
public class Room {

	private Integer id;
	private int buildingNo;
	private int roomNo;

	public Room() {

	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}

	public int getBuildingNo() {
		return buildingNo;
	}

	public void setBuildingNo(int buildingNo) {
		this.buildingNo = buildingNo;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String toString() {
		return "Room [id=" + id + ", buildingNo=" + buildingNo + ", roomNo=" + roomNo + "]";
	}

}
