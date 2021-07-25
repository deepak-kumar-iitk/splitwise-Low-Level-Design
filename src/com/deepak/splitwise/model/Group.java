package com.deepak.splitwise.model;

import java.util.*;

public class Group {
	private int id;
	private String name;
	private List<Integer> members;

//	public Group(int id, String name, List<User> members){
//		this.id = id;
//		this.name = name;
//		this.members = members;
//	}
	
	public Group() {
		
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMembers(List<Integer> members) {
		this.members = members;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Integer> getMembers() {
		return members;
	}
	
	
}
