package com.apub.dorm.domain;

import java.io.Serializable;
import java.util.List;


public class CheckInFormData implements Serializable{
	
	private static final long serialVersionUID = 1L;


	private List<Integer> id;
	private List<String> itemName;
	private List<String> description;
	private List<Boolean> available;
	private List<String> status;

	public CheckInFormData() {

	}

	public List<Integer> getId() {
		return id;
	}

	public void setId(List<Integer> id) {
		this.id = id;
	}

	public List<String> getItemName() {
		return itemName;
	}

	public void setItemName(List<String> itemName) {
		this.itemName = itemName;
	}

	public List<String> getDescription() {
		return description;
	}

	public void setDescription(List<String> description) {
		this.description = description;
	}

	public List<Boolean> getAvailable() {
		return available;
	}

	public void setAvailable(List<Boolean> available) {
		this.available = available;
	}

	public List<String> getStatus() {
		return status;
	}

	public void setStatus(List<String> status) {
		this.status = status;
	}
}