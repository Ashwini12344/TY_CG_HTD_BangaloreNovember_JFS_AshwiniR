package com.capgemini.forestjdbc.main;
import java.util.Scanner;
public class Admin {
	public static void main(String[] args) {

	    String Username;
	    String Password;

	    Password = "admin";
	    Username = "admin";

	    Scanner input1 = new Scanner(System.in);
	    System.out.println("Enter Username : ");
	    String username = input1.next();

	    Scanner input2 = new Scanner(System.in);
	    System.out.println("Enter Password : ");
	    String password = input2.next();

	    if (username.equals(Username) && password.equals(Password)) {

	        System.out.println("Access Granted! Welcome!\n");
	        ForestApplication.main(args);
	    }

	    else if (username.equals(Username)) {
	        System.out.println("Invalid Password!");
	    } else if (password.equals(Password)) {
	        System.out.println("Invalid Username!");
	    } else {
	        System.out.println("Invalid Username & Password!");
	        Scanner input = new Scanner(System.in);
		    System.out.println("Enter Username : ");
		    String username1 = input.next();

		    Scanner inputt = new Scanner(System.in);
		    System.out.println("Enter Password : ");
		    String passwordd = inputt.next();
		    ForestApplication.main(null);
	    }

	}

}
