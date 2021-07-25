package com.deepak.splitwise.service;

import java.util.Map;
import java.util.HashMap;
import com.deepak.splitwise.model.Expense;

public class ExpenseService {
	public static Map<Integer, Expense> billdetails = new HashMap<Integer, Expense>(); //
	
	public void createExpense(int id, int gid, float amount, Map<Integer, Float> contribution, Map<Integer, Float> paidby) {
		//do validation here
		Expense exp = new Expense();
		exp.setId(id);
		exp.setGid(gid);
		exp.setAmount(amount);
		exp.setContribution(contribution);
		exp.setPaidby(paidby);
		billdetails.put(id, exp);
		
	}
	
	
}
