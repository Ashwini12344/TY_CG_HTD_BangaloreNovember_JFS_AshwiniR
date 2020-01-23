package com.capgemini.fmshibernate.controller;

import java.util.Scanner;

public class ForestMain {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		try {
			while (true) {
				System.out.println("1.contract");
				System.out.println("2.Customer");
				System.out.println("3.Product");
				System.out.println("4.Land");
				System.out.println("5.Scheduler");
				System.out.println("6.Back\n");
				System.out.println("Enter your choice");
				int ch = sc.nextInt();
				switch (ch) {
				case 1:
					ContractController.contractDetails();
					break;
				case 2:
					CustomerController.customerDetails();
					break;
				case 3:
					ProductController.productDetails();
					break;
				case 4:
					LandController.landDetails();
					break;
				case 5:
					SchedulerController.scheduleDetails();
					break;
				case 6:
					ForestMain.main(null);
					break;
				default:
					System.out.println("enter correct option");
					break;

				}
			}
		} catch (Exception e) {
			System.err.println("Invalid input enter number");
			ForestMain.main(null);

		}
	}
}
