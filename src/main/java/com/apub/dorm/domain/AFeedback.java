package com.apub.dorm.domain;

import java.io.Serializable;

public abstract class AFeedback implements Serializable {

	private static final long serialVersionUID = 1L;

	protected Integer id;
	protected String firstName;
	protected String lastName;
	protected String comments;
	protected String email;

	public abstract void setId(Integer id);

	public abstract Integer getId();

	public abstract String getFirstName();

	public abstract void setFirstName(String firstName);

	public abstract String getLastName();

	public abstract void setLastName(String lastName);

	public abstract String getComments();

	public abstract void setComments(String comments);

	public abstract String getEmail();

	public abstract void setEmail(String email);

}
