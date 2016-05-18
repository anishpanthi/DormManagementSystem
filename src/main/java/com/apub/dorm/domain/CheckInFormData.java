package com.apub.dorm.domain;

import java.io.Serializable;
import java.util.Arrays;

public class CheckInFormData implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer[] id;
	private String[] itemName;
	private String[] description;
	private Boolean[] available;
	private String[] status;

	public CheckInFormData() {

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

	public Boolean[] getAvailable() {
		return available;
	}

	public void setAvailable(Boolean[] available) {
		this.available = available;
	}

	public String[] getStatus() {
		return status;
	}

	public void setStatus(String[] status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "CheckInFormData [id=" + Arrays.toString(id) + ", itemName=" + Arrays.toString(itemName)
				+ ", description=" + Arrays.toString(description) + ", available=" + Arrays.toString(available)
				+ ", status=" + Arrays.toString(status) + "]";
	}
}