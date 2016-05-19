package com.apub.dorm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apub.dorm.domain.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{
	Item findById(int id);
	
}
