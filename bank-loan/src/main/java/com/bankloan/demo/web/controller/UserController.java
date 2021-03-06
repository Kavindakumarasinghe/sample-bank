package com.bankloan.demo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bankloan.demo.aggregate.user.projection.User;
import com.bankloan.demo.aggregate.user.service.UserService;

@RequestMapping("/api/v1/")
@RestController
public class UserController {
	
	@Autowired
	public UserService userService;
	
	@PostMapping("/user")
    public User createUser (@RequestBody User user) {
		
		return userService.save(user);
	}

}
