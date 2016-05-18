package com.apub.dorm.domain;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Transactional
public class Building {
	@Id
	@GeneratedValue
	private Integer id;
	private String buildingName;
	private String buildingAddress;
	private String buildingType;
	private int buildingNo;

	@JsonIgnore
	@OneToMany(fetch = FetchType.EAGER, cascade=javax.persistence.CascadeType.ALL, mappedBy = "building")
	private List<Room> rooms;
	
	

	@Transient
	@JsonIgnore
	private List<Integer> roomIds;

	public Building() {

	}

	public String getBuildingAddress() {
		return buildingAddress;
	}

	public void setBuildingAddress(String buildingAddress) {
		this.buildingAddress = buildingAddress;
	}

	public String getBuildingType() {
		return buildingType;
	}

	public void setBuildingType(String buildingType) {
		this.buildingType = buildingType;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	@NotNull
	public int getBuildingNo() {
		return buildingNo;
	}

	public void setBuildingNo(int buildingNo) {
		this.buildingNo = buildingNo;
	}

	@NotNull
	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public List<Integer> getRoomIds() {
		return roomIds;
	}

	public void setRoomIds(List<Integer> roomIds) {
		this.roomIds = roomIds;
	}

	@Override
	public String toString() {
		return "Building [id=" + id + ", buildingName=" + buildingName + ", buildingAddress=" + buildingAddress
				+ ", buildingType=" + buildingType + ", buildingNo=" + buildingNo + ", rooms=" + rooms + ", roomIds="
				+ roomIds + "]";
	}	
	

}
