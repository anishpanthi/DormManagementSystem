package com.apub.dorm.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apub.dorm.domain.RoomAssignment;

@Repository
public interface RoomAssignmentRepository extends JpaRepository<RoomAssignment, Serializable> {

}
