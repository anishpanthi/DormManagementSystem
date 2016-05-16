package com.apub.dorm.domain;

import java.io.Serializable;
import java.util.Date;

public abstract class AMaintenance implements Serializable {

	private static final long serialVersionUID = 1L;

	protected Integer id;
	
	protected String title;
	
	protected String description;
	
	protected Date registeredDate;
	
	protected MaintenanceStatus status;
	
	protected Date updatedDate;
	
	protected Student student;

	public abstract void setId(Integer id);

	public abstract Integer getId();


	

}
