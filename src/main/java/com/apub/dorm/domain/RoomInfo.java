package com.apub.dorm.domain;

public class RoomInfo {
	private int roomNo;
	private String roomStatus;	
	
	
	public RoomInfo(int roomNo, String roomStatus) {
		this.roomNo = roomNo;
		this.roomStatus = roomStatus;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomStatus() {
		return roomStatus;
	}
	public void setRoomStatus(String roomStatus) {
		this.roomStatus = roomStatus;
	}
	
	
}
