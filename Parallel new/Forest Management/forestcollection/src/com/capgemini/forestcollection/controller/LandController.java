package com.capgemini.forestcollection.controller;

import java.util.Scanner;

import com.capgemini.forestcollection.bean.LandBean;
import com.capgemini.forestcollection.dao.LandDAO;
import com.capgemini.forestcollection.manager.LandDaoManager;
import com.capgemini.forestcollection.util.Validate;

public class LandController {
	public static void landDetails() {
		LandDAO dao = LandDaoManager.getLandDao();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("*LAND OPERATIONS*");
			System.out.println("--------------");
			System.out.println("Select the option to perform operations");
			System.out.println("Option 1: Add land details");
			System.out.println("Option 2: Remove land details");
			System.out.println("option 3: modify land details");
			System.out.println("Option 4: show land details");
			System.out.println("Option 5: Home");

			int ch2 = sc.nextInt();
			switch (ch2) {
			case 1:
				LandBean bean = new LandBean();
				System.out.println("Add Details of land");
				System.out.println("-------------------");
				System.out.println("Enter land id");
				int landId = sc.nextInt();
				while (!(Validate.countofdigits(landId) == 3)) {
					System.err.println("Enter 3 digit land Number!!!");
					landId = sc.nextInt();
				}

				System.out.println("Enter land location");
				String loc = sc.next();
				// while (!loc.matches("[a-zA-Z,]")) {
				// System.err.println("Enter valid land location");
				// loc = sc.next();
				// }
				System.out.println("Enter land Price");
				int landVal = sc.nextInt();
				while (!(Validate.countofdigits(landId) == 3)) {
					System.err.println("Enter 3 digit land Number!!!");
					landId = sc.nextInt();
				}
				System.out.println("Enter acquired date in dd/mm/yyyy format");
				String date = sc.next();
				while (!date.matches("^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{2,4}+")) {
					System.out.println("Enter valid date");
					date = sc.next();

				}
				bean.setLandId(landId);
				bean.setLandLoc(loc);
				bean.setAcqDate(date);
				bean.setLandVal(landVal);
				boolean check = dao.addLand(bean);
				if (check) {
					System.out.println("land added");
					System.out.println(bean.toString());
				} else {
					System.out.println();
				}

				break;
			case 2:
				System.out.println("Enter land id to remove details ");
				landId = sc.nextInt();
				boolean check1 = dao.removeLand(landId);
				if (check1) {
					System.out.println("LAND DELETED");
				} else {
					System.err.println("NO LAND FOUND");
				}

				break;
			case 3:
				System.out.println("enter land id to modify details");
				landId = sc.nextInt();
				LandBean bean1 = new LandBean();
				bean1.setLandVal(landId);
				boolean result = dao.modifyLand(landId, bean1);
				if (result) {
					System.out.println("details updated");
				} else {
					System.out.println("land id not found");
				}
				break;

			case 4:
				System.out.println("Display all land details");
				dao.showAllLands();

			case 5:
				Admin.main(null);
				break;
			default:
				System.out.println("enter correct option");
				break;
			}
		}

	}

}
