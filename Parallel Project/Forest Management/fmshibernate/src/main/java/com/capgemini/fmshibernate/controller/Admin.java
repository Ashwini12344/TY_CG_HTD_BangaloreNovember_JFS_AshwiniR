package com.capgemini.fmshibernate.controller;

import java.util.Scanner;

public class Admin {
	public static void main(String[] args) {

	    

	    @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	    try {
	    while(true) {
	    System.out.println("1.Admin");
	    System.out.println("2.Client");
	    System.out.println("Enter your choice");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:System.out.println("***********Welcome to Admin************");
	    System.out.println("Enter Username");
		String username = sc.next();
	    System.out.println("Enter Password :");
	    String password = sc.next();
	    if (username.equals("admin") && password.equals("admin")) {
	    	System.out.println("Access Granted! Welcome!\n");
	        ForestMain.main(args);
	    }
	    else {
	    	System.out.println("Invalid credentials please enter valid credentials ");
	    	Admin.main(null);
	    }

		case 2:System.out.println("*****Welcome to Client Page*****");
		System.out.println("Enter Username");
		String username1 = sc.next();
	    System.out.println("Enter Password :");
	    String password1 = sc.next();
	    if (username1.equals("client") && password1.equals("client")) {
	    	System.out.println("Access Granted! Welcome!\n");
	        ContractDetails.contractDetails();
	        CustomerDetails.customerDetails();
	    }
	    else {
	    	System.out.println("Invalid credentials please enter valid credentials ");
	    	Admin.main(null);
	    }
	    
	    
	    }   
	}}catch (Exception e) {
		System.err.println("Invalid input enter number");
		ForestMain.main(null);
	}
	}
}
	    
	   


