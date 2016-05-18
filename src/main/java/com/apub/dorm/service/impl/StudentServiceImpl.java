package com.apub.dorm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.apub.dorm.domain.Room;
import com.apub.dorm.domain.Student;
import com.apub.dorm.repository.BuildingRepository;
import com.apub.dorm.repository.RoomRepository;
import com.apub.dorm.repository.StudentRepository;
import com.apub.dorm.service.StudentService;

@Component
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	@Autowired
	BuildingRepository buildingRepository;
	@Autowired
	RoomRepository roomRepository;
	
	@Override
	public Student findByUsername(String username) {
		
		return studentRepository.findByUsername(username);
	}


	public Student findOne(int id) {
		return studentRepository.findOne(id);
	}
	
	

	public void create(Student student) {
		// TODO Auto-generated method stub
		
		//if(student.getBuildingNo()!=null)
		//student.setBuiding(buildingRepository.findOne(student.getBuildingNo()));
		if(student.getRoomNo()!=null)
		student.setRoom(roomRepository.findOne(student.getRoomNo()));
		studentRepository.save(student);
	}

	@Override
	public Student findStudentByStudentId(String studentId) {
		// TODO Auto-generated method stub
		return studentRepository.findStudentByStudentId(studentId);
	}

	@Override
	public List<Student> findListOfStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

}
