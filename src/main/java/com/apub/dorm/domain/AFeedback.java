package com.apub.dorm.domain;

import java.io.Serializable;

public abstract class AFeedback implements Serializable {

	private static final long serialVersionUID = 1L;

	protected Integer id;
	protected String firstName;
	protected String lastName;
	protected String comments;
	protected String email;

}
