package com.apub.dorm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Staff extends APerson {

	private static final long serialVersionUID = 1L;
	
	public Staff(){
		
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

	@NotEmpty(message = "Last Name cannot be empty.")
	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	public String getPassword() {
		return password;
	}

	@NotEmpty(message = "Password cannot be empty.")
	@Override
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", message = "Invalid Email Address. Email will not apper in anywhere.")
	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	@Override
	public String getUserRole() {
		return userRole;
	}

}
