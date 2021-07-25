package com.deepak.splitwise.controller;

import java.util.List;

import com.deepak.splitwise.service.GroupService;
import com.deepak.splitwise.model.Group;

public class GroupController {
	private GroupService grpService;
	
	public GroupController(GroupService grpService) {
		this.grpService = grpService;
	}
	
	public Group createGroup(int id, String name, List<Integer> members) {
		return this.grpService.createGroup(id, name, members);
	}
}
