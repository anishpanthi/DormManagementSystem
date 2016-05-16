package com.apub.dorm.service;

import java.util.List;

import com.apub.dorm.domain.Item;

public interface ItemService {

	public void create(Item item);

//	public void delete(int id);

	public List<Item> findAll();
	
	public Item findOne(Integer id);

//	public void update(Item item);

//	public Item findById(int id);

}
