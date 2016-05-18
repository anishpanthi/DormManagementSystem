package com.apub.dorm.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
*
* @author Anish Panthi
*/
@Entity
public class CheckOutForm implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id;
	private String itemName;
	private String description;
	private String previousStatus;
	private String currentStatus;

	public CheckOutForm(){
		
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	@Id
	@GeneratedValue
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

	public String getPreviousStatus() {
		return previousStatus;
	}

	public void setPreviousStatus(String previousStatus) {
		this.previousStatus = previousStatus;
	}

	public String getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}
}
