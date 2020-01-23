package com.capgemini.fmshibernate.controller;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import com.capgemini.fmshibernate.bean.Scheduler;
import com.capgemini.fmshibernate.exception.ForestException;
import com.capgemini.fmshibernate.service.SchedulerService;
import com.capgemini.fmshibernate.service.SchedulerServiceImpl;
import com.capgemini.fmshibernte.util.Validate;

public class SchedulerController {
	public static void scheduleDetails() {

		Scanner sc = new Scanner(System.in);
		SchedulerService service = new SchedulerServiceImpl();
		while (true) {
			System.out.println("1.Add Schedule details");
			System.out.println("2.Delete Schedule details");
			System.out.println("3.Modify Schedule details");
			System.out.println("4.Show Schedule details");
			System.out.println("5.Back");
			Scheduler bean = new Scheduler();
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
				String deliveryDate = null;
				System.out.println("Enter delivery date");

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

					bean.setDeliveryDate(deliveryDate);
				}

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
				List<Scheduler> check2 = service.getAllSchedules();
				System.out.println(check2);
				break;
			case 5:
				ForestMain.main(null);
				break;
			}

		}
	}
}
