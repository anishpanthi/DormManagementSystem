package com.apub.dorm.domain;

import java.io.Serializable;
import java.util.Arrays;

public class CheckOutFormData implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer[] id;
	private String[] itemName;
	private String[] description;
	private String[] previousStatus;
	private String[] currentStatus;

	public CheckOutFormData() {

	}

	public Integer[] getId() {
		return id;
	}

	public void setId(Integer[] id) {
		this.id = id;
	}

	public String[] getItemName() {
		return itemName;
	}

	public void setItemName(String[] itemName) {
		this.itemName = itemName;
	}

	public String[] getDescription() {
		return description;
	}

	public void setDescription(String[] description) {
		this.description = description;
	}

	public String[] getPreviousStatus() {
		return previousStatus;
	}

	public void setPreviousStatus(String[] previousStatus) {
		this.previousStatus = previousStatus;
	}

	public String[] getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(String[] currentStatus) {
		this.currentStatus = currentStatus;
	}

	@Override
	public String toString() {
		return "CheckOutFormData [id=" + Arrays.toString(id) + ", itemName=" + Arrays.toString(itemName)
				+ ", description=" + Arrays.toString(description) + ", previousStatus="
				+ Arrays.toString(previousStatus) + ", currentStatus=" + Arrays.toString(currentStatus) + "]";
	}
}