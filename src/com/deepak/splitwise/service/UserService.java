package com.deepak.splitwise.service;

import com.deepak.splitwise.model.User;

public class UserService {
	
	public User createUser(int id, String name) {
		//do the validation part here
		User user = new User();
		user.setId(id);
		user.setName(name);
		return user;
	}
	
	//


}
