package com.apub.dorm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apub.dorm.domain.Room;
import com.apub.dorm.domain.RoomAssignment;
import com.apub.dorm.repository.RoomAssignmentRepository;
import com.apub.dorm.service.RoomAssignmentService;

@Service
public class RoomAssignmentServiceImpl implements RoomAssignmentService {
	@Autowired
	private RoomAssignmentRepository roomAssignmentRepository; 
	
	@Override
	public void create(RoomAssignment roomAssignment) {
		roomAssignmentRepository.save(roomAssignment);
	}
}
