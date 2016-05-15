package com.apub.dorm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Building extends ABuilding {
	
	private static final long serialVersionUID = 1L;
	
	public Building(){
		
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

}
