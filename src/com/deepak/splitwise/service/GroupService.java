package com.deepak.splitwise.service;

import java.util.List;

import com.deepak.splitwise.model.Group;

public class GroupService {
	
	public Group createGroup(int id, String name, List<Integer> members) {
		//do validation here
		Group group = new Group();
		group.setId(id);
		group.setName(name);
		group.setMembers(members);
		return group;
		
	}
	
	//

}
