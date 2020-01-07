package com.capgemini.fmshibernate.controller;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.capgemini.fmshibernate.details.ContractDetails;
import com.capgemini.fmshibernate.details.CustomerDetails;
import com.capgemini.fmshibernate.details.ProductDetails;

public class ForestMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			while (true) {
				System.out.println("1.contract");
				System.out.println("2.Customer");
				System.out.println("3.Product");
				System.out.println("4.Back\n");
				System.out.println("Enter your choice");
				int ch = sc.nextInt();
				switch (ch) {
				case 1:
					ContractDetails.contractDetails();
					break;
				case 2:
					CustomerDetails.customerDetails();
					break;
				case 3:
					ProductDetails.productDetails();
					break;
				case 4:
					ForestMain.main(null);
				}
			}
		} catch (Exception e) {
			System.err.println("Invalid input enter number");
			ForestMain.main(null);

		}
	}
}
