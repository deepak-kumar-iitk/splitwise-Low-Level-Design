package com.deepak.splitwise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.deepak.splitwise.controller.UserController;
import com.deepak.splitwise.controller.GroupController;
import com.deepak.splitwise.controller.ExpenseController;
import com.deepak.splitwise.service.UserService;
import com.deepak.splitwise.service.GroupService;
import com.deepak.splitwise.service.ExpenseService;
import com.deepak.splitwise.model.*;

public class Splitwise {
	
	private static UserController userController = new UserController(new UserService());
	private static GroupController grpController = new GroupController(new GroupService());
	private static ExpenseController expController = new ExpenseController(new ExpenseService());
	
	
	private static Map<Integer, User> idToUser = new HashMap<Integer, User>();
	private static Map<Integer, Group> idToGroup = new HashMap<Integer, Group>();
	
	private static int uid = 0;
	private static int gid = 0;
	private static int expid = 0;
	
	public static Scanner s;

	
	public static void main(String str[]) {
		
		s=new Scanner(System.in);

		
		User u1 = userController.createUser(++uid, "ayush");
		idToUser.put(uid, u1);
		User u2 = userController.createUser(++uid, "dheeraj");
		idToUser.put(uid, u2);
		User u3 = userController.createUser(++uid, "owais");
		idToUser.put(uid, u3);
		
		List<Integer> users = new ArrayList<Integer>();
		users.add(1);
		users.add(2);
		users.add(3);
		
		Group g1 = grpController.createGroup(++gid, "Goa Trip", users);
		
		while(true) {
			System.out.println("*** Please select an option ***"+ '\n'+ "1 --> addGroupExpense" + '\n' + "2 --> showUserBalanceDetails");
			int op = s.nextInt();
			switch(op){
			case 1:
				addGroupExpense();
				break;
			case 2:
				showUserBalanceDetails();
				break;
			}
		}

	}
	
	private static void addGroupExpense() {
		System.out.println("### Enter the details in following format ###" + '\n' + "GroupId Amount PaidById {Contribution in key:val}");
		s.nextLine();
		String[] str = s.nextLine().trim().split("\\s+");
		
		int gid = Integer.parseInt(str[0]);
		float amount  = Float.parseFloat(str[1]);
		
		Map<Integer, Float> paidby = new HashMap<Integer, Float>();
		paidby.put(Integer.parseInt(str[2]), amount);
		
		Map<Integer, Float> contribution = new HashMap<Integer, Float>();
		//System.out.println(str.length);
		
		for(int i=3; i<str.length; i++) {
			contribution.put(Integer.parseInt(str[i].split(":")[0]), Float.parseFloat(str[i].split(":")[1]));
		}
		
		expController.createExpense(++expid, gid, amount, contribution, paidby);
		System.out.println("-- Expense Added --\n");
	}
	
	private static void showUserBalanceDetails() {
		System.out.println("Enter UserId: ");
		s.nextLine();
		String[] str = s.nextLine().trim().split("\\s+");
		int uid  = Integer.parseInt(str[0]);
		float amount  = expController.getUserBalance(uid);
		System.out.println(amount);
		System.out.println();
	}



}
