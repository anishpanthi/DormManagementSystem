package com.apub.dorm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.apub.dorm.domain.Room;
import com.apub.dorm.domain.Student;

@Service
public interface StudentService {
	
	Student findByUsername(String username);
	
	Student findOne(int id);
	void create(Student student);
	List<Student> findListOfStudent();
	Student findStudentByStudentId(String studentId);
}
