package com.apub.dorm.service;

import org.springframework.stereotype.Service;

import com.apub.dorm.domain.Student;

@Service
public interface StudentService {
	
	Student findByUsername(String username);
}
