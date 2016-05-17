package com.apub.dorm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Building {
	private Integer id;
	private String buildingName;
	private int buildingNo;

	public Building() {

	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Id
	@GeneratedValue
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

}
