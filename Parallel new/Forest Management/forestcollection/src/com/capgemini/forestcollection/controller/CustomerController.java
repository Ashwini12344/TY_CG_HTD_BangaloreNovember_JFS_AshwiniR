package com.capgemini.forestcollection.controller;

import java.util.Scanner;

import com.capgemini.forestcollection.bean.CustomerBean;
import com.capgemini.forestcollection.dao.*;
import com.capgemini.forestcollection.exception.ForestException;
import com.capgemini.forestcollection.manager.CustomerDAOManager;
import com.capgemini.forestcollection.util.Validate;

public class CustomerController {
	public static void customerDetails() {
		CustomerDAO dao1 = CustomerDAOManager.getCustomerDAO();
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.Add customer details");
			System.out.println("2.Delete customer details");
			System.out.println("3.Modify customer details");
			CustomerBean bean1 = new CustomerBean();
			int ch2 = sc.nextInt();
			switch (ch2) {
			case 1:
				System.out.println("Enter Customer id");
				int custid = sc.nextInt();
				while (!(Validate.countofdigits(custid) == 3)) {
					System.err.println("Enter 3 digit Customer Id!!!");
					custid = sc.nextInt();
				}
				System.out.println("Enter customer name");
				String custname = sc.next();
				while (!custname.matches("[a-zA-Z,]{3,15}+")) {

					System.err.println("Minimum 3 characters required");
					custname = sc.next();
				}

				System.out.println("Enter street address1");
				String s1 = sc.next();
				System.out.println("Enter street address2");
				String s2 = sc.next();
				System.out.println("Enter the town");
				String s3 = sc.next();
				System.out.println("Enter pincode");
				String pin = sc.next();
				while (!pin.matches("^[0-9]{6}$")) {
					System.err.println("Enter 6 digit pin number");
					pin = sc.next();

				}
				System.out.println("Enter email");
				String email = sc.next();
				while (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
					System.err.println("Enter valid email");
					email = sc.next();

				}
				System.out.println("Enter telno");
				String tel = sc.next();
				while (!tel.matches("^[0-9]{10}$")) {
					System.err.println("Enter 10 digit phone number");
					tel = sc.next();

				}
				bean1.setCustid(custid);
				bean1.setCustname(custname);
				bean1.setStreetAddress1(s1);
				bean1.setStreetAddress2(s2);
				bean1.setPostalcode(pin);
				bean1.setTown(s3);
				bean1.setEmail(email);
				bean1.setTelno(tel);
				try {
					boolean check = dao1.addCustomer(bean1);
					if (check) {
						System.out.println("Customer added");
						System.out.println(bean1.toString());
					} else {
						System.out.println("something went wrong");
					}
				} catch (ForestException e) {
					System.out.println(e.getMessage());
				}

				break;
			case 2:
				System.out.println("enter Customer id");
				custid = sc.nextInt();
				boolean check3 = dao1.deleteCustomer(custid);
				if (check3) {
					System.out.println("user deleted\n");
				} else {
					System.out.println("no user found");
				}
				break;

			case 3:
				System.out.println("Enter custid");
				bean1.setCustid(sc.nextInt());
				System.out.println("enter new email");
				bean1.setEmail(sc.nextLine());
				String email1 = sc.next();
				boolean result = dao1.modifyCustomer(email1);
				if (result) {
					System.out.println("user email updated");
				} else {
					System.err.println("something went wrong");
				}

			}
		}
	}
}
