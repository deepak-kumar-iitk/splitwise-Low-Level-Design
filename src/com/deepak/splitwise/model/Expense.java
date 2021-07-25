package com.deepak.splitwise.model;

import java.util.*;

public class Expense {
	private int id;
	private int gid;
	private float amount;
	private Map<Integer, Float> contribution;
	private Map<Integer, Float> paidby;
	
//	Expense(int id, int gid, float amount, Map<User, Float> contribution, Map<User, Float> paidby){
//		this.id = id;
//		this.gid = gid;
//		this.amount = amount;
//		this.contribution = contribution;
//		this.paidby = paidby;
//	}
	
	public Expense() {
		
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public void setContribution(Map<Integer, Float> contribution) {
		this.contribution = contribution;
	}

	public void setPaidby(Map<Integer, Float> paidby) {
		this.paidby = paidby;
	}

	public int getId() {
		return id;
	}

	public int getGid() {
		return gid;
	}

	public float getAmount() {
		return amount;
	}

	public Map<Integer, Float> getContribution() {
		return contribution;
	}

	public Map<Integer, Float> getPaidby() {
		return paidby;
	}
	
	

}
