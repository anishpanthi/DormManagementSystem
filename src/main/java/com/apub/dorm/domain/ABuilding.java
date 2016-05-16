package com.apub.dorm.domain;

import java.io.Serializable;

public abstract class ABuilding implements Serializable {

	private static final long serialVersionUID = 1L;

	protected Integer id;
	protected String buildingName;
	protected int buildingNo;

	public abstract void setId(Integer id);

	public abstract Integer getId();

	public abstract int getBuildingNo();

	public abstract void setBuildingNo(int buildingNo);

	public abstract String getBuildingName();

	public abstract void setBuildingName(String buildingName);

}
