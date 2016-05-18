package com.apub.dorm.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class CheckInForm implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;
	private String itemName;
	private String description;

	@Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT false")
	private boolean available;
	private String status;
	
	@Transient
	List<Integer> checkedItemsId;

	public CheckInForm() {

	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Integer> getCheckedItemsId() {
		return checkedItemsId;
	}

	public void setCheckedItemsId(List<Integer> checkedItemsId) {
		this.checkedItemsId = checkedItemsId;
	}
}
