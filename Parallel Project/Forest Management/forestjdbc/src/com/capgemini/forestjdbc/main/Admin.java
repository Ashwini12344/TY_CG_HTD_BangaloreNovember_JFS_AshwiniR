package com.capgemini.forestjdbc.main;
import java.util.Scanner;
public class Admin {
	public static void main(String[] args) {

	    String Username;
	    String Password;


	    Scanner sc = new Scanner(System.in);
	    while(true) {
	    System.out.println("Enter Username : ");
	    String username = sc.next();

	   // Scanner input2 = new Scanner(System.in);
	    System.out.println("Enter Password : ");
	    String password = sc.next();

	    if (username.equals("admin") && password.equals("admin")) {

	        System.out.println("Access Granted! Welcome!\n");
	        ForestApplication.main(args);
	    }
	    else {
	    	System.out.println("Invalid credentials please enter valid credentials ");
	    }
}
	}
}