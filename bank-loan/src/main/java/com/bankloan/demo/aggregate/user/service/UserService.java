package com.bankloan.demo.aggregate.user.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bankloan.demo.aggregate.user.dao.UserRepository;
import com.bankloan.demo.aggregate.user.projection.User;

public class UserService {
	
	@Autowired
	public UserRepository userRepository;
	
	public User save(User user) {
		
		return userRepository.save(user);
	}

	

}
