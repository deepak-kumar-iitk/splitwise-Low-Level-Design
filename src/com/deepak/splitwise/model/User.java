package com.deepak.splitwise.model;

public class User {
	private int id;
	private String name;
	
//	public User(int id, String name){
//		this.id = id;
//		this.name = name;
//	}
	
	public User() {
		
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
