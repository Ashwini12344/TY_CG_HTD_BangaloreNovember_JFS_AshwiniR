package com.capgemini.forestjdbc.controller;
import java.util.List;
import java.util.Scanner;

import com.capgemini.forestjdbc.bean.CustomerBean;
import com.capgemini.forestjdbc.bean.ProductBean;
import com.capgemini.forestjdbc.dao.CustomerDAO;
import com.capgemini.forestjdbc.factory.Factory;
import com.capgemini.forestjdbc.main.ForestApplication;
import com.capgemini.forestjdbc.services.CustomerServices;
import com.capgemini.forestjdbc.validate.Validate;



public class CustomerDetails {
	public static void customerDetails() {
		CustomerServices service=Factory.instanceOfCustomerServices();

		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("1.Add customer details");
			System.out.println("2.Delete customer details");
			System.out.println("3.Modify customer details");
			System.out.println("4.Show Customer details");
			System.out.println("5.Back");
			CustomerBean bean=new CustomerBean();
			int ch2=sc.nextInt();
			switch(ch2) {
			case 1:System.out.println("Enter Customer id");
			int custid=sc.nextInt();
			while (!(Validate.countofdigits(custid) == 3)) {
				System.err.println("Enter 3 digit Customer Id!!!");
				custid = sc.nextInt();
			}
			System.out.println("Enter customer name");
			String custname=sc.next();
			while(!custname.matches("[a-zA-Z,]{3,15}+")) {
				System.err.println("Enter valid name");
				custname=sc.next();

			}
			System.out.println("Enter street address1");
			String s1=sc.next();
			System.out.println("Enter street address2");
			String s2=sc.next();
			System.out.println("Enter the town");
			String s3=sc.next();
			System.out.println("Enter pincode");
			String pin=sc.next();
			while(!pin.matches("^[0-9]{6}$")) {
				System.err.println("Enter valid pincode");
				pin=sc.next();

			}
			System.out.println("Enter email");
			String email=sc.next();
			while(!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {	
				System.out.println("Enter valid email");
				email=sc.next();
			}
			System.out.println("Enter telno");
			String tel=sc.next();
			while(!tel.matches("^[0-9]{10}$"))
			{
				System.out.println("Enter 10 digit phone number");
				tel=sc.next();

			}
			bean.setCustid(custid);
			bean.setCustname(custname);
			bean.setStreetAddress1(s1);
			bean.setStreetAddress2(s2);
			bean.setPostalcode(pin);
			bean.setTown(s3);
			bean.setEmail(email);
			bean.setTelno(tel);
			boolean check=service.addCustomer(bean);
			if(check) {
				System.out.println("Customer added");
				System.out.println(bean.toString());
			}

			break;
			case 2:System.out.println("enter Customer id");
			int custid1=sc.nextInt();
			boolean check3=service.deleteCustomer(custid1);
			if(check3) {
				System.out.println("user deleted\n");
			}
			else {
				System.out.println("no user found");
			}
			break;
			case 3:System.out.println("enter Customer id");
			int cusid=sc.nextInt();
			System.out.println("enter new email");
			email=sc.next();
			//CustomerBean bean=new CustomerBean();
			bean.setCustid(cusid);
			bean.setEmail(email);
			CustomerServices services=Factory.instanceOfCustomerServices();
			boolean result = services.modifyCustomer(bean);
			if(result)
			{
				System.out.println("user email updated");
			}


			break;
			case 4:List<CustomerBean> check2=service.showCustomer();
		      System.out.println(check2);
		      break;
			case 5:ForestApplication.main(null);
			break;
			}

		}
	}
}

