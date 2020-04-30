package com.capgemini.forestjdbc.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.forestjdbc.bean.CustomerBean;
import com.capgemini.forestjdbc.bean.SchedulerBean;
import com.capgemini.forestjdbc.exception.ForestException;
import com.capgemini.forestjdbc.factory.Factory;
import com.capgemini.forestjdbc.main.ForestApplication;
import com.capgemini.forestjdbc.services.SchedulerServices;
import com.capgemini.forestjdbc.util.Validate;

public class SchedulerController {
	public static void scheduleDetails() {
		SchedulerServices service = Factory.instanceOfSchedulerServices();

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.Add Schedule details");
			System.out.println("2.Delete Schedule details");
			System.out.println("3.Modify Schedule details");
			System.out.println("4.Show Schedule details");
			System.out.println("5.Back");
			SchedulerBean bean = new SchedulerBean();
			int ch2 = sc.nextInt();
			switch (ch2) {
			case 1:
				System.out.println("Enter schedule id");
				int scheduleId = sc.nextInt();
				while (!(Validate.countofdigits(scheduleId) == 3)) {
					System.err.println("Enter 3 digit Customer Id!!!");
					scheduleId = sc.nextInt();
				}
				System.out.println("Enter contract no");
				int contractNo = sc.nextInt();
				while (!(Validate.countofdigits(contractNo) == 3)) {
					System.err.println("Enter 3 digit Contract no!!!");
					contractNo = sc.nextInt();
				}
				System.out.println("Enter product id");
				int ProductId = sc.nextInt();
				while (!(Validate.countofdigits(ProductId) == 3)) {
					System.err.println("Enter 3 digit ProductId !!!");
					ProductId = sc.nextInt();
				}
				System.out.println("Enter quantity");
				int quantity = sc.nextInt();

				System.out.println("Enter delivery date");
				String deliveryDate = sc.next();

				bean.setScheduleId(scheduleId);
				bean.setContractId(contractNo);
				bean.setProductId(ProductId);
				bean.setQuantity(quantity);
				bean.setDeliveryDate(deliveryDate);
				try {
					boolean check = service.addSchedule(bean);
					if (check) {
						System.out.println("Schedule added");
						System.out.println(bean.toString());
					}
				} catch (ForestException e) {
					System.out.println(e.getMessage());
				}
				break;

			case 2:
				System.out.println("enter schedule id");
				scheduleId = sc.nextInt();
				boolean check3 = service.deleteSchedule(scheduleId);
				if (check3) {
					System.out.println("schedule deleted\n");
				} else {
					System.out.println("no user found");
				}
				break;
			case 3:
				System.out.println("enter schedule id to modify");
				scheduleId = sc.nextInt();
				bean.setScheduleId(scheduleId);
				try {
					if (service.getSchedule(scheduleId) != null) {
						System.out.println("Enter new contract no");
						bean.setContractId(sc.nextInt());
						System.out.println("Enter new product id");
						bean.setProductId(sc.nextInt());
						System.out.println("Enter new quantity");
						bean.setQuantity(sc.nextInt());
						System.out.println("Enter delivery date");
						bean.setDeliveryDate(sc.next());

						service.modifySchedule(bean);
						System.out.println("Schedule updated successfully");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

				break;
			case 4:
				List<SchedulerBean> check2 = service.getAllSchedules();
				System.out.println(check2);
				break;
			case 5:
				ForestApplication.main(null);
				break;
			}

		}
	}

}