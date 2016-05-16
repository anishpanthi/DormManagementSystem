package com.apub.dorm.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Anish Panthi
 */
@Entity
public class Maintenance extends AMaintenance {

	private static final long serialVersionUID = 1L;

	public Maintenance() {

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

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@NotNull(message = "Description is Required")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

//	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="registeredDate", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	public Date getRegisteredDate() {
		return registeredDate;
	}
	
	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}

	public MaintenanceStatus getStatus() {
		return status;
	}

	public void setStatus(MaintenanceStatus status) {
		this.status = status;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@JoinColumn(name = "student_id")
	@ManyToOne
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
