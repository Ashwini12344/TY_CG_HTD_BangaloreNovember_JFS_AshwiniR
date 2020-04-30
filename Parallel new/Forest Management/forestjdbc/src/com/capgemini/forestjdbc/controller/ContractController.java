package com.capgemini.forestjdbc.controller;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import com.capgemini.forestjdbc.bean.ContractBean;
import com.capgemini.forestjdbc.exception.ForestException;
import com.capgemini.forestjdbc.factory.Factory;
import com.capgemini.forestjdbc.main.ForestApplication;
import com.capgemini.forestjdbc.services.*;
import com.capgemini.forestjdbc.util.Validate;

public class ContractController {
	public static void contractDetails() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		ContractServices service = Factory.instanceOfContractServices();
		while (true) {
			System.out.println("1.Add Contract Details");
			System.out.println("2.Delete Contract details");
			System.out.println("3.Show Contract");
			System.out.println("4.Back");
			int ch1 = sc.nextInt();
			ContractBean bean = new ContractBean();
			switch (ch1) {
			case 1:
				System.out.println("enter Contract no");
				int contractNo = sc.nextInt();
				while (!(Validate.countofdigits(contractNo) == 3)) {
					System.err.println("Enter 3 digit Contract Number!!!");
					contractNo = sc.nextInt();
				}
				System.out.println("enter customer-id");
				int custid = sc.nextInt();
				while (!(Validate.countofdigits(custid) == 3)) {
					System.err.println("Enter 3 digit Customer Id!!!");
					custid = sc.nextInt();
				}
				System.out.println("enter product-id");
				int prodid = sc.nextInt();
				while (!(Validate.countofdigits(prodid) == 3)) {
					System.err.println("Enter 3 digit product Id !!!");
					prodid = sc.nextInt();
				}
				System.out.println("enter Haulier-id");
				int haulid = sc.nextInt();
				while (!(Validate.countofdigits(haulid) == 3)) {
					System.err.println("Enter 3 digit product Id !!!");
					haulid = sc.nextInt();

				}
				String deliveryDate =null;
				 System.out.println("Enter delivery date(DD/MM/YYYY)");
				 boolean condition=true;
				 while(condition) {
					 deliveryDate=sc.next();
				 try {
				 if (Validate.deliveryDate(deliveryDate)) {
				    if (Validate.isValidfuture(deliveryDate)) {
				    	condition=false;
				    }else {
				    	System.out.println("Enter future date");
				    }
				 } else {
					 System.out.println("Enter date in (DD/MM/YYYY)");
				 }
				
				 } catch (ParseException e) {
				 
				 }
				 
				bean.setDeliverydate(deliveryDate);
			 }
				

				System.out.println("enter quantity");
				int quantity = sc.nextInt();
				bean.setContractNo(contractNo);
				bean.setCustid(custid);
				bean.setProdid(prodid);
				bean.setHaulid(haulid);
				bean.setDeliverydate(deliveryDate);
				bean.setQuantity(quantity);
				try {
				boolean check = service.addContractor(bean);
				
					if (check) {
						System.out.println("contractor added");
						//System.out.println(bean.toString());
					}
				} catch (ForestException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				System.out.println("Enter contractno");
				 contractNo = sc.nextInt();
				boolean check1 = service.deleteContractor(contractNo);
				if (check1) {
					System.out.println("USER DELETED");
				} else {
					System.err.println("NO USER FOUND");
				}
				break;
			case 3:
				List<ContractBean> check2 = service.showContract();
				System.out.println(check2);
				break;
			case 4:
				ForestApplication.main(null);
				break;
			}
		}
	}
}