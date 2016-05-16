package com.apub.dorm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Anish Panthi
 */
@Entity
public class Room extends ARoom {

	private static final long serialVersionUID = 1L;

	public Room() {

	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	@Id
	@GeneratedValue
	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public int getBuildingNo() {
		return buildingNo;
	}

	@Override
	public void setBuildingNo(int buildingNo) {
		this.buildingNo = buildingNo;
	}

	@Override
	public int getRoomNo() {
		return roomNo;
	}

	@Override
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", buildingNo=" + buildingNo + ", roomNo=" + roomNo + "]";
	}
	
	

}
