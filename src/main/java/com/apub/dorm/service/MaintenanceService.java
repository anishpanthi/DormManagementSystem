package com.apub.dorm.service;

import java.util.List;

import com.apub.dorm.domain.Feedback;
import com.apub.dorm.domain.Maintenance;
import com.apub.dorm.domain.Student;

public interface MaintenanceService {

	public void create(Maintenance maintenance);

	public void delete(int id);

	public List<Maintenance> findAll();
	
	public Maintenance findOne(Integer id);

	public void update(Maintenance maintenance, int id);
	
	public List<Maintenance> findByStudent(Student student);

	
}
