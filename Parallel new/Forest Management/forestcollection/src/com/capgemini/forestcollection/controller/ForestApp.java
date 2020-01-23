package com.capgemini.forestcollection.controller;

import java.util.*;

import com.capgemini.forestcollection.controller.ContractController;
import com.capgemini.forestcollection.controller.CustomerController;
import com.capgemini.forestcollection.controller.ProductContoller;

public class ForestApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     try {
			while (true) {
				System.out.println("1.contract");
				System.out.println("2.Customer");
				System.out.println("3.Product");
				System.out.println("4.Land");
				System.out.println("5.Back");
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
					ProductContoller.productDetails();
					break;
				case 4:
					LandController.landDetails();
					break;
				case 5:
					ForestApp.main(null);
					break;
				default:
					System.out.println("Enter valid input!!!!!!");
					break;
				}

				}

			
	} catch (Exception e) {
		System.err.println("Input mismatch exception please enter number only");
		ForestApp.main(null);
	}
	}
}
