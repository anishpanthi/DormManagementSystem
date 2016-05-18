package com.apub.dorm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.apub.dorm.domain.Student;
import com.apub.dorm.repository.StudentRepository;
import com.apub.dorm.service.StudentService;

@Component
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public Student findByUsername(String username) {
		
		return studentRepository.findByUsername(username);
	}

	@Override
	public Student findOne(int id) {
		return studentRepository.findOne(id);
	}
	
	

}
