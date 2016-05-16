package com.apub.dorm.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apub.dorm.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Serializable> {
	
	public Student findByUsername(String username);

}
