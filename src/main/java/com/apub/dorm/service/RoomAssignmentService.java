package com.apub.dorm.service;

import org.springframework.stereotype.Service;

import com.apub.dorm.domain.RoomAssignment;

@Service
public interface RoomAssignmentService {
	public void create(RoomAssignment roomAssignment);
}
