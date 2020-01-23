package com.capgemini.fmshibernate.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.fmshibernate.bean.Customer;
import com.capgemini.fmshibernate.controller.ForestMain;
import com.capgemini.fmshibernate.service.CustomerService;
import com.capgemini.fmshibernate.service.CustomerServiceImpl;

public class CustomerController {
	public static void customerDetails() {
		CustomerService service = new CustomerServiceImpl();

		while (true) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("1.Add customer details");
			System.out.println("2.Delete customer details");
			System.out.println("3.Modify customer details");
			System.out.println("4.Show Customer");
			Customer bean = new Customer();
			int ch2 = sc.nextInt();
			switch (ch2) {
			case 1:
				System.out.println("Enter Customer id");
				int custid = sc.nextInt();
				System.out.println("Enter customer name");
				String custname = sc.next();
				while (!custname.matches("[a-zA-Z,]{3,15}+")) {
					System.err.println("Enter valid name");
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
					System.err.println("Enter valid pincode");
					pin = sc.next();

				}
				System.out.println("Enter email");
				String email = sc.next();
				while (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
					System.out.println("Enter valid email");
					email = sc.next();
				}
				System.out.println("Enter telno");
				String tel = sc.next();
				while (!tel.matches("^[0-9]{10}$")) {
					System.out.println("Enter 10 digit phone number");
					tel = sc.next();

				}
				bean.setCustomerid(custid);
				bean.setCustomer_name(custname);
				bean.setStreetAddress1(s1);
				bean.setStreetAddress2(s2);
				bean.setPostal_code(pin);
				bean.setTown(s3);
				bean.setEmail(email);
				bean.setTelephone(tel);
				boolean check = service.addCustomer(bean);
				if (check) {
					System.out.println("Customer added");
					System.out.println(bean.toString());
				}

				break;
			case 2:
				System.out.println("enter Customer id");
				int custid1 = sc.nextInt();
				boolean check3 = service.deleteCustomer(custid1);
				if (check3) {
					System.out.println("user deleted\n");
				} else {
					System.out.println("no user found");
				}
				break;
			case 3:
				System.out.println("enter Customer id");
				int cusid = sc.nextInt();
				System.out.println("enter new email");
				email = sc.next();
				bean.setCustomerid(cusid);
				bean.setEmail(email);

				boolean result = service.modifyCustomer(bean);
				if (result) {
					System.out.println("user email updated");
				}
				break;
			case 4:
				List<Customer> check2 = service.showCustomer();
				System.out.println(check2);
				break;
			case 5:
				ForestMain.main(null);
				break;
			}

		}
	}
}
