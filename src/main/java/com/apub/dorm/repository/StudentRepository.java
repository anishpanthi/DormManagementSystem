package com.apub.dorm.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.apub.dorm.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Serializable> {
	
	public Student findByUsername(String username);
	public Student findStudentByStudentId(String studentId);
	
	@Query(nativeQuery=true, value="SELECT * from student where id IN (select distinct s.id from student s, checkinform c where s.id = c.student_id)")
	List<Student> findByMatchingIdFromCheckInFormAndStudent();
	
	@Query(nativeQuery=true, value="SELECT * from student where id IN (select distinct s.id from student s, checkoutform c where s.id = c.student_id)")
	List<Student> findByMatchingIdFromCheckOutFormAndStudent();

}
