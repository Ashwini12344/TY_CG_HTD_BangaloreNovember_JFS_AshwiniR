package com.cg.forest.util;
import java.util.*;

import com.cg.forest.details.ContractDetails;
import com.cg.forest.details.CustomerDetails;
import com.cg.forest.details.ProductDetails;
public class ForestApp1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		while(true) {
			System.out.println("1.contract");
			System.out.println("2.Customer");
			System.out.println("3.Product");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:ContractDetails.contractDetails();
				break;
			case 2:CustomerDetails.customerDetails();
			break;
			case 3:ProductDetails.productDetails();
				break;
			
			}

		}}catch(Exception e) {
			System.err.println("Invalid input enter number");
			ForestApp1.main(null);
		}

}
}
