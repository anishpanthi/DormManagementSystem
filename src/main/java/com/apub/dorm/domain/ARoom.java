package com.apub.dorm.domain;

import java.io.Serializable;

public abstract class ARoom implements Serializable {

	private static final long serialVersionUID = 1L;

	protected Integer id;
	protected int buildingNo;
	protected int roomNo;

	public abstract int getBuildingNo();

	public abstract void setBuildingNo(int buildingNo);

	public abstract int getRoomNo();

	public abstract void setRoomNo(int roomNo);

	public abstract void setId(Integer id);

	public abstract Integer getId();

}
