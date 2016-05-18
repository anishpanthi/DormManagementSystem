package com.apub.dorm.service;

import com.apub.dorm.domain.User;

public interface UserService {

	public User findByUsername(String username);

}
