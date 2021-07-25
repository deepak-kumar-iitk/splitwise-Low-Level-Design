package com.deepak.splitwise.controller;

import com.deepak.splitwise.service.UserService;
import com.deepak.splitwise.model.User;

public class UserController {
	
	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}

	public User createUser(int id, String name) {
		return this.userService.createUser(id, name);
	}
}
