/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apub.dorm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Anish Panthi
 */
@Entity
public class User extends APerson {

	private static final long serialVersionUID = 1L;

	public User() {
	}

	@Id
	@GeneratedValue(generator = "User_SequenceStyleGenerator")
	@GenericGenerator(name = "User_SequenceStyleGenerator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "User_SEQ"), @Parameter(name = "optimizer", value = "hilo"),
			@Parameter(name = "initial_value", value = "1"), @Parameter(name = "increment_size", value = "1") })
	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@NotEmpty(message = "Password cannot be empty.")
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String getUserRole() {
		return userRole;
	}

	@NotEmpty(message = "Userrole cannot be empty.")
	@Override
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@NotEmpty(message = "Username cannot be empty.")
	@Override
	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@NotEmpty(message = "First Name cannot be empty.")
	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String getMiddleName() {
		return middleName;
	}

	@Override
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

	@NotEmpty(message = "First Name cannot be empty.")
	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", message = "Invalid Email Address.")
	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "com.apub.dorm.domain.User[ id=" + id + " ]";
	}
}
