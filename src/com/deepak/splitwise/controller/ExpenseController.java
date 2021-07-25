package com.deepak.splitwise.controller;

import java.util.Map;

import com.deepak.splitwise.service.ExpenseService;
import com.deepak.splitwise.model.Expense;

public class ExpenseController {
	private ExpenseService expService;
	
	public ExpenseController(ExpenseService expService) {
		this.expService = expService;
	}
	
	public void createExpense(int id, int gid, float amount, Map<Integer, Float> contribution, Map<Integer, Float> paidby) {
		expService.createExpense(id, gid, amount, contribution, paidby);
	}
	
	public float getUserBalance(int uid) {
		float bal = 0;
		for(Map.Entry<Integer, Expense> e : ExpenseService.billdetails.entrySet()) {
			if(e.getValue().getContribution().containsKey(uid)) {
				bal -= e.getValue().getContribution().get(uid);
			}
			if(e.getValue().getPaidby().containsKey(uid)) {
				bal += e.getValue().getPaidby().get(uid);
			}
		}
		return bal;
	}

}
