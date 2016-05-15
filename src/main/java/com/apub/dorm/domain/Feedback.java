/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apub.dorm.domain;

import java.io.Serializable;

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
public class Feedback implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int id;
	@Lob
	@NotEmpty(message = "Comments cannot be empty.")
	private String comments;

	@Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", message = "Invalid Email Address. Email will not apper in anywhere.")
	private String email;

	@NotEmpty(message = "First Name cannot be empty.")
	private String firstname;

	@NotEmpty(message = "Last Name cannot be empty.")
	private String lastname;

	public Feedback() {
	}

	public Feedback(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	// @Override
	// public int hashCode() {
	// int hash = 0;
	// hash += (id != null ? id.hashCode() : 0);
	// return hash;
	// }
	//
	// @Override
	// public boolean equals(Object object) {
	// // TODO: Warning - this method won't work in the case the id fields are
	// not set
	// if (!(object instanceof Feedback)) {
	// return false;
	// }
	// Feedback other = (Feedback) object;
	// if ((this.id == null && other.id != null) || (this.id != null &&
	// !this.id.equals(other.id))) {
	// return false;
	// }
	// return true;
	// }

	@Override
	public String toString() {
		return "com.apub.dorm.domain.Feedback[ id=" + id + " ]";
	}

}
