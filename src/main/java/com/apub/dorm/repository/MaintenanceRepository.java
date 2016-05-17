package com.apub.dorm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apub.dorm.domain.Maintenance;
import com.apub.dorm.domain.Student;

public interface MaintenanceRepository extends JpaRepository<Maintenance, Integer>{

	List<Maintenance> findByStudent(Student student);
	
}
