package com.apub.dorm.domain;

import java.io.Serializable;

public abstract class APerson implements Serializable {

	private static final long serialVersionUID = 1L;

	protected Integer id;
	protected String firstName;
	protected String middleName;
	protected String lastName;
	protected String username;
	protected String password;
	protected String email;
	protected String userRole;

	public abstract void setId(Integer id);

	public abstract Integer getId();

	public abstract String getFirstName();

	public abstract void setFirstName(String firstName);

	public abstract String getMiddleName();

	public abstract void setMiddleName(String middleName);

	public abstract String getLastName();

	public abstract void setLastName(String lastName);

	public abstract String getUsername();

	public abstract void setUsername(String username);

	public abstract String getPassword();

	public abstract void setPassword(String password);

	public abstract String getEmail();

	public abstract void setEmail(String email);
	
	public abstract void setUserRole(String userRole);
	
	public abstract String getUserRole();
	
}
