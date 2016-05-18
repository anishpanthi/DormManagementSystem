package com.apub.dorm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apub.dorm.domain.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUsername(String username);
}