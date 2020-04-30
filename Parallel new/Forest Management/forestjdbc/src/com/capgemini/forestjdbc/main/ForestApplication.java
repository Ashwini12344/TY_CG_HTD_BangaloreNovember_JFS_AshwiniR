package com.capgemini.forestjdbc.main;

import java.util.Scanner;
import com.capgemini.forestjdbc.controller.ContractController;
import com.capgemini.forestjdbc.controller.CustomerController;
import com.capgemini.forestjdbc.controller.LandController;
import com.capgemini.forestjdbc.controller.ProductController;
import com.capgemini.forestjdbc.controller.SchedulerController;

public class ForestApplication {
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
					ForestApplication.main(null);
					break;
				default:
					System.out.println("Enter valid input!!!!!!");
					break;
				}

			}
		} catch (Exception e) {
			System.out.println("Invalid input enter number!!!!!!!!!!!!!");
			ForestApplication.main(null);

		}
	}
}