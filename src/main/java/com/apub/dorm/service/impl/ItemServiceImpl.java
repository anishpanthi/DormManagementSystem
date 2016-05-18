package com.apub.dorm.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.apub.dorm.domain.Item;
import com.apub.dorm.repository.ItemRepository;
import com.apub.dorm.service.ItemService;

@Component
@Transactional
public class ItemServiceImpl implements ItemService{
	
	@Autowired
	private ItemRepository itemRepository;

	@Override
	public List<Item> findAll() {
		return itemRepository.findAll();
	}

	@Override
	public void create(Item item) {
		itemRepository.save(item);
		
	}

	@Override
	public Item findOne(Integer id) {
		return itemRepository.findOne(id);
	}

	@Override
	public void delete(Item item) {
		itemRepository.delete(item);
	}
	
	@Override 
	public void update(Item item, int id){
		item.setId(id);
		itemRepository.save(item);
	}
}
