package com.capgemini.fmshibernate.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.fmshibernate.bean.Land;
import com.capgemini.fmshibernate.service.LandServiceImpl;
import com.capgemini.fmshibernate.service.LandServices;
import com.capgemini.fmshibernte.util.Validate;

public class LandController {
	public static void landDetails() {
		LandServices service =new LandServiceImpl();;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("*LAND OPERATIONS*");
			System.out.println("--------------");
			System.out.println("Select the option to perform operations");
			System.out.println("Option 1: Add land details");
			System.out.println("Option 2: Remove land details");
			System.out.println("Option 3: show land details");
			System.out.println("Option 4: Home");

			int ch2 = sc.nextInt();
			switch (ch2) {
			case 1:
				Land bean = new Land();
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
				boolean check = service.addLand(bean);
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
				boolean check1 = service.removeLand(landId);
				if (check1) {
					System.out.println("LAND DELETED");
				} else {
					System.err.println("NO LAND FOUND");
				}

				break;
			
			case 3:
				//System.out.println("Display all land details");
				List<Land> check2=service.showAllLands();
				System.out.println(check2);

			case 4:
				Admin.main(null);
				break;
			default:
				System.out.println("enter correct option");
				break;
			}
		}

	}

}