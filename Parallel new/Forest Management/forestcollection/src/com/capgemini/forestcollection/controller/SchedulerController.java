package com.capgemini.forestcollection.controller;

import java.util.Scanner;

import com.capgemini.forestcollection.bean.SchedulerBean;
import com.capgemini.forestcollection.dao.SchedulerDAO;
import com.capgemini.forestcollection.manager.SchedulerDAOManager;
import com.capgemini.forestcollection.util.Validate;

public class SchedulerController {
	public static void schedulerDetails() {
		SchedulerDAO dao1 = SchedulerDAOManager.getSchedulerDAO();
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("press 1 : Add schedule");
			System.out.println("press 2 : Modify schedule");
			System.out.println("press 3 : delete schedule ");
			System.out.println("press 4 : Search schedule ");
			System.out.println("press 5 : Get All schedule ");
			System.out.println("Press 0 : BAck");
			int ch2 = sc.nextInt();
			switch (ch2) {
			case 1:
				SchedulerBean sbean = new SchedulerBean();
				System.out.println("Enter ScheduleId ");
				int scheduleId = sc.nextInt();
				while (!(Validate.countofdigits(scheduleId) == 3)) {
					System.err.println("Enter 3 digit Contract Number!!!");
					scheduleId = sc.nextInt();
				}
				System.out.println("Enter ProductId");
				int ProductId = sc.nextInt();
				while (!(Validate.countofdigits(scheduleId) == 3)) {
					System.err.println("Enter 3 digit Contract Number!!!");
					scheduleId = sc.nextInt();
				}
				System.out.println("enter Contract no");
				int contractId = sc.nextInt();
				while (!(Validate.countofdigits(contractId) == 3)) {
					System.err.println("Enter 3 digit Contract Number!!!");
					contractId = sc.nextInt();
				}
				System.out.println("Enter Quantity");
				System.out.println("enter quantity");
				int quantity = sc.nextInt();
				System.out.println("enter delivery date");
				String deliveryDate = sc.next();
				while (!deliveryDate.matches("^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{2,4}+")) {
					System.err.println("Enter valid date");
					deliveryDate = sc.next();

				}
				sbean.setScheduleId(scheduleId);
				sbean.setContractId(contractId);
				sbean.setProductId(ProductId);
				sbean.setDeliveryDate(deliveryDate);
				sbean.setQuantity(quantity);
				boolean check = dao1.addSchedule(sbean);
				if (check) {
					System.out.println("Schedule added");
					System.out.println(sbean.toString());
				} else {
					System.out.println("something went wrong");
				}
				break;

			case 2:

				SchedulerBean sbean1 = new SchedulerBean();
				System.out.println("Enter Id to Modify Schedule");
				scheduleId = sc.nextInt();
				sbean1.setScheduleId(scheduleId);
				boolean result = dao1.modifySchedule(sbean1);
				if (result) {
					System.out.println("details updated");
				} else {
					System.out.println("schedule id not found");
				}
				break;
			}
		}
	}
}
