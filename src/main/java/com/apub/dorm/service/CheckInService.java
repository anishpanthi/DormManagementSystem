package com.apub.dorm.service;

import java.util.List;

import com.apub.dorm.domain.CheckInForm;
import com.apub.dorm.domain.Student;

public interface CheckInService {

	public void create(CheckInForm checkInForm);

//	public void delete(int id);

	public List<CheckInForm> findAll();

//	public void update(CheckinForm checkInForm);

//	public CheckinForm findById(int id);
	
	List<CheckInForm> findByStudent(Student student);
	
}
