package com.apub.dorm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apub.dorm.domain.Building;
import com.apub.dorm.repository.BuildingRepository;
import com.apub.dorm.service.BuildingService;

@Service
public class BuildingServiceImpl implements BuildingService {
	@Autowired
	private BuildingRepository buildingRepository;

	@Override
	public void create(Building building) {
		buildingRepository.save(building);
	}

	@Override
	public List<Building> getBuildings() {
		return buildingRepository.findAll();
	}

}
