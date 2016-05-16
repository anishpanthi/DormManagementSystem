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
	
}
