package com.apub.dorm.service;

import java.util.List;

import com.apub.dorm.domain.CheckOutForm;
import com.apub.dorm.domain.Student;

public interface CheckOutService {

	public void create(CheckOutForm checkOutForm);

//	public void delete(int id);

	public List<CheckOutForm> findAll();

//	public void update(CheckOutForm checkOutForm);

//	public CheckOutForm findById(int id);
	
	List<CheckOutForm> findByStudent(Student student);
	
}
