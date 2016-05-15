package com.apub.dorm.domain;

import java.io.Serializable;

public abstract class AItem implements Serializable {
	
	private static final long serialVersionUID = 1L;
	protected Integer id;
	protected String name;
	protected String description;
	
	public abstract Integer getId();
	public abstract void setId(Integer id);
	public abstract String getName();
	public abstract void setName(String name);
	public abstract String getDescription();
	public abstract void setDescription(String description);
	
}
	