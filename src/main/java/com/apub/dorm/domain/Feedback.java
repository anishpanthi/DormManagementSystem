/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apub.dorm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Anish Panthi
 */
@Entity
public class Feedback extends AFeedback {

	private static final long serialVersionUID = 1L;

	public Feedback() {
	}

	@Id
	@GeneratedValue
	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String getComments() {
		return comments;
	}

	@Lob
	@NotEmpty(message = "Comments cannot be empty.")
	@Override
	public void setComments(String comments) {
		this.comments = comments;
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
	public String getFirstName() {
		return firstName;
	}

	@NotEmpty(message = "First Name cannot be empty.")
	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
	public String toString() {
		return "com.apub.dorm.domain.Feedback[ id=" + id + " ]";
	}

}
