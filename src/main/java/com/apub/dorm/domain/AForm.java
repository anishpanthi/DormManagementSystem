package com.apub.dorm.domain;

import java.io.Serializable;

public abstract class AForm implements Serializable {

	private static final long serialVersionUID = 1L;

	protected Integer id;

	public abstract void setId(Integer id);

	public abstract Integer getId();

}
