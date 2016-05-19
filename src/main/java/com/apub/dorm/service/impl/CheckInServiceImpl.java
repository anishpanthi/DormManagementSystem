package com.apub.dorm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.apub.dorm.domain.CheckInForm;
import com.apub.dorm.domain.Student;
import com.apub.dorm.repository.CheckInRepository;
import com.apub.dorm.service.CheckInService;

@Component
@Transactional
public class CheckInServiceImpl implements CheckInService {

	@Autowired
	private CheckInRepository checkInRepository;

	@Override
	public void create(CheckInForm checkInForm) {
		checkInRepository.save(checkInForm);
	}

	@Override
	public List<CheckInForm> findAll() {
		return checkInRepository.findAll();
	}

	@Override
	public List<CheckInForm> findByStudent(Student student) {
		return checkInRepository.findByStudent(student);
	}

//	@Override
//	public List<CheckInForm> findByStudentId(int id) {
//		return checkInRepository.findByStudentId(id);
//	}

}
