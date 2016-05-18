package com.apub.dorm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.apub.dorm.domain.CheckOutForm;
import com.apub.dorm.domain.Student;
import com.apub.dorm.repository.CheckOutRepository;
import com.apub.dorm.service.CheckOutService;

@Component
@Transactional
public class CheckOutServiceImpl implements CheckOutService {

	@Autowired
	private CheckOutRepository checkOutRepository;

	@Override
	public void create(CheckOutForm checkOutForm) {
		checkOutRepository.save(checkOutForm);
	}

	@Override
	public List<CheckOutForm> findAll() {
		return checkOutRepository.findAll();
	}

	@Override
	public List<CheckOutForm> findByStudent(Student student) {
		return checkOutRepository.findByStudent(student);
	}
}
