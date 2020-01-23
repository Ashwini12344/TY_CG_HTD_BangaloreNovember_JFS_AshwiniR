package com.capgemini.forestjdbc.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.forestjdbc.bean.CustomerBean;
import com.capgemini.forestjdbc.bean.ProductBean;
import com.capgemini.forestjdbc.dao.CustomerDAO;
import com.capgemini.forestjdbc.exception.ForestException;
import com.capgemini.forestjdbc.factory.Factory;
import com.capgemini.forestjdbc.main.ForestApplication;
import com.capgemini.forestjdbc.services.CustomerServices;
import com.capgemini.forestjdbc.util.Validate;

public class CustomerController {
	public static void customerDetails() {
		CustomerServices service = Factory.instanceOfCustomerServices();

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.Add customer details");
			System.out.println("2.Delete customer details");
			System.out.println("3.Modify customer details");
			System.out.println("4.Show Customer details");
			System.out.println("5.Back");
			CustomerBean bean = new CustomerBean();
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
					System.err.println("Enter valid name");
					custname = sc.next();

				}
				System.out.println("Enter street address1");
				String streetAddr1 = sc.next();
				System.out.println("Enter street address2");
				String streetAddr2 = sc.next();
				System.out.println("Enter the town");
				String town = sc.next();
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
				bean.setCustid(custid);
				bean.setCustname(custname);
				bean.setEmail(email);
				bean.setPostalcode(pin);
				bean.setStreetAddress1(streetAddr1);
				bean.setStreetAddress2(streetAddr2);
				bean.setTelno(tel);
				bean.setTown(town);
				try {
					boolean check = service.addCustomer(bean);
					if (check) {
						System.out.println("Customer added");
						System.out.println(bean.toString());
					}
				} catch (ForestException e) {
					System.out.println(e.getMessage());
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
				System.out.println("enter customer id to modify");
				int customerid = sc.nextInt();
				bean.setCustid(customerid);
				try {
					if (service.getCustomer(customerid) != null) {
						System.out.println("Enter new customer name");
						bean.setCustname(sc.next());
						System.out.println("Enter new street address1");
						bean.setStreetAddress1(sc.next());
						System.out.println("Enter new street address2");
						bean.setStreetAddress2(sc.next());
						System.out.println("Enter new email");
						bean.setEmail(sc.next());
						System.out.println("Enter new postal code");
						bean.setPostalcode(sc.next());
						System.out.println("Enter new town");
						bean.setTown(sc.next());
						service.modifyCustomer(bean);
						System.out.println("customer updated successfully");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			case 4:
				List<CustomerBean> check2 = service.showCustomer();
				System.out.println(check2);
				break;
			case 5:
				ForestApplication.main(null);
				break;
			}

		}
	}
}
