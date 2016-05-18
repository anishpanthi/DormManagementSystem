package com.apub.dorm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apub.dorm.domain.CheckOutForm;
import com.apub.dorm.domain.Student;

public interface CheckOutRepository extends JpaRepository<CheckOutForm, Integer>{
	
	List<CheckOutForm> findByStudent(Student student);
	
}
