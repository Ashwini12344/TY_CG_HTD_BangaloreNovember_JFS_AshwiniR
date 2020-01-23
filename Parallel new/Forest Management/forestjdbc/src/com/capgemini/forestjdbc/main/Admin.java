package com.capgemini.forestjdbc.main;

import java.util.Scanner;

import com.capgemini.forestjdbc.controller.ContractController;
import com.capgemini.forestjdbc.controller.CustomerController;
import com.capgemini.forestjdbc.controller.SchedulerController;

public class Admin {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	    try {
	    while(true) {
	    System.out.println("1.Admin");
	    System.out.println("2.Client");
	    System.out.println("3.Scheduler");
	    System.out.println("Enter your choice");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:System.out.println("------Welcome to Admin-------");
	    System.out.println("Enter Username");
		String username = sc.next();
	    System.out.println("Enter Password :");
	    String password = sc.next();
	    if (username.equals("admin") && password.equals("admin")) {
	    	System.out.println("Access Granted! Welcome!\n");
	        ForestApplication.main(args);
	    }
	    else {
	    	System.out.println("Invalid credentials please enter valid credentials ");
	    	Admin.main(null);
	    }
	    break;

		case 2:System.out.println("------Welcome to Client Page-------");
		System.out.println("Enter Username");
		String username1 = sc.next();
	    System.out.println("Enter Password :");
	    String password1 = sc.next();
	    if (username1.equals("client") && password1.equals("client")) {
	    	System.out.println("Access Granted! Welcome!\n");
	        ContractController.contractDetails();
	        CustomerController.customerDetails();
	    }
	    else {
	    	System.out.println("Invalid credentials please enter valid credentials ");
	    	Admin.main(null);
	    }
	    
		break;
	    case 3:System.out.println("-------Welcome Scheduler-------");
	    System.out.println("Enter Username");
	    String username2 = sc.next();System.out.println("Enter Password :");
		String password2 = sc.next();if(username2.equals("scheduler")&&password2.equals("scheduler"))
		{
			System.out.println("Access Granted! Welcome!\n");
			SchedulerController.scheduleDetails();
			
		}else
		{
			System.out.println("Invalid credentials please enter valid credentials ");
			Admin.main(null);
		}
		break;
	}}}catch (Exception e) {
		System.err.println("Invalid input enter number");
	 ForestApplication.main(null);
	}
	}


}