package com.apub.dorm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apub.dorm.domain.CheckInForm;
import com.apub.dorm.domain.Student;

public interface CheckInRepository extends JpaRepository<CheckInForm, Integer>{
	
	List<CheckInForm> findByStudent(Student student);
	
//	List<CheckInForm> findByStudentId(int id); 
	
}
