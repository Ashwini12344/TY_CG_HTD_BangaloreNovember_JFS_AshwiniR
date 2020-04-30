package com.capgemini.forestcollection.controller;

import java.text.ParseException;
import java.util.Scanner;

import com.capgemini.forestcollection.bean.ContractBean;
import com.capgemini.forestcollection.dao.ContractDAO;
import com.capgemini.forestcollection.exception.ForestException;
import com.capgemini.forestcollection.manager.ContractDAOManager;
import com.capgemini.forestcollection.util.Validate;

public class ContractController {

	public static void contractDetails() {
		Scanner sc = new Scanner(System.in);
		ContractDAO dao = ContractDAOManager.getContractDAO();
		while (true) {
			System.out.println("1.Add Contract Details");
			System.out.println("2.Delete Contract details");
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
				int custId = sc.nextInt();
				while (!(Validate.countofdigits(custId) == 3)) {
					System.err.println("Enter 3 digit Customer Id!!!");
					custId = sc.nextInt();
				}
				System.out.println("enter product-id");
				int prodId = sc.nextInt();
				while (!(Validate.countofdigits(prodId) == 3)) {
					System.err.println("Enter 3 digit product Id !!!");
					prodId = sc.nextInt();
				}

				System.out.println("enter Haulier-id");
				int haulId = sc.nextInt();
				while (!(Validate.countofdigits(haulId) == 3)) {
					System.err.println("Enter 3 digit product Id !!!");
					haulId = sc.nextInt();

				}

				String deliveryDate = null;
				System.out.println("Enter delivery date(DD/MM/YYYY)");
				boolean condition = true;
				while (condition) {
					deliveryDate = sc.next();
					try {
						if (Validate.deliveryDate(deliveryDate)) {
							if (Validate.isValidfuture(deliveryDate)) {
								condition = false;
							} else {
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
				bean.setContractno(contractNo);
				bean.setCustid(custId);
				bean.setProdid(prodId);
				bean.setHaulid(haulId);
				bean.setDeliverydate(deliveryDate);
				bean.setQuantity(quantity);
				boolean check = dao.addContractor(bean);
				try {
					if (check) {
						System.out.println("contractor added");
						System.out.println(bean.toString());
					}
				} catch (ForestException e) {
					System.err.println("Already contract no exists");
				}
				break;
			case 2:
				System.out.println("Enter contractno");
				contractNo = sc.nextInt();
				boolean check1 = dao.deleteContractor(contractNo);
				if (check1) {
					System.out.println("USER DELETED");
				} else {
					System.err.println("NO USER FOUND");
				}
				break;
			}
		}
	}
}