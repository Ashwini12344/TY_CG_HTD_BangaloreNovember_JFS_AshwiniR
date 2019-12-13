package com.capgemini.phoneapp.controller;

import java.util.Scanner;

public class ContactInfo {
	public static void contactInfo() {
	Scanner sc=new Scanner(System.in);
	while(true) {
		System.out.println("Press 1 to call");
		System.out.println("Press 2 to message");
		System.out.println("Press 3 to go back to main menu");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice) {
			case 1:System.out.println("Select number to call");
					break;
			case 2:System.out.println("Send msg");
					break;
			case 3:System.out.println("Back to main menu");
				break;
		}
		

}
	}
}


