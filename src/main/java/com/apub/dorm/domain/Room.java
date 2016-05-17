package com.apub.dorm.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.hibernate.annotations.Cascade;




/**
 *
 * @author Anish Panthi
 */
@Entity
public class Room {
	@Id
	@GeneratedValue
	private Integer id;

	@ManyToOne
	@JoinColumn
	private Building building;

	@OneToMany(mappedBy = "room")
	private List<Student> students;
	
	
	@ManyToMany(cascade =CascadeType.ALL)
	@JoinTable
	private List<Item> items;
	private int roomNo;
	private String roomStatus;

	@Transient
	private List<Integer> itemIds;
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public String getRoomStatus() {
		return roomStatus;
	}

	public void setRoomStatus(String roomStatus) {
		this.roomStatus = roomStatus;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	
	public List<Integer> getItemIds() {
		return itemIds;
	}

	public void setItemIds(List<Integer> itemIds) {
		this.itemIds = itemIds;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", building=" + building + ", students=" + students + ", items=" + items + ", roomNo="
				+ roomNo + ", roomStatus=" + roomStatus + ", itemIds=" + itemIds + "]";
	}


	
	

}
