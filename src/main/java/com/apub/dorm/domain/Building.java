package com.apub.dorm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Building extends ABuilding {

	private static final long serialVersionUID = 1L;

	public Building() {

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

	@NotNull
	@Override
	public int getBuildingNo() {
		return buildingNo;
	}

	@Override
	public void setBuildingNo(int buildingNo) {
		this.buildingNo = buildingNo;
	}

	@NotNull
	@Override
	public String getBuildingName() {
		return buildingName;
	}

	@Override
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

}
