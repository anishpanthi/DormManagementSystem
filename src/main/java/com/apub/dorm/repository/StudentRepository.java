package com.apub.dorm.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apub.dorm.domain.Student;
import java.lang.String;

@Repository
public interface StudentRepository extends JpaRepository<Student, Serializable> {
	
	public Student findByUsername(String username);
	public Student findStudentByStudentId(String studentId);

}
