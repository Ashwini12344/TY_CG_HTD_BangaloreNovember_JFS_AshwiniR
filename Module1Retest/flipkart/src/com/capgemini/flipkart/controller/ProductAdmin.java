package com.capgemini.flipkart.controller;
import java.util.List;
import java.util.Scanner;

import com.capgemini.flipkart.beans.ProductBean;
import com.capgemini.flipkart.dao.ProductDao;
import com.capgemini.flipkart.factory.ProductFactory;
import com.capgemini.flipkart.home.TestProduct;



public class ProductAdmin {
	
	public static void showProduct() {
		ProductDao dao=ProductFactory.instanceOfProductDaoImpl();


		List<ProductBean> list=dao.showProduct();

		if(list!=null) {
			for (ProductBean user1 : list) {
				System.out.println(user1);

			}
		}
	}
	public static void searchProduct() {
		ProductDao dao=ProductFactory.instanceOfProductDaoImpl();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name");
		String s=scanner.next();
		//if(dao.searchProduct(s)) {
			while(true) {
				System.out.println("Press 1 to buy\nPress 2 to search again\npress 3 go back to main menu");
				int option=scanner.nextInt();
				switch(option) {
				case 1: System.out.println("Enter 16 digit pin");
				 long cardnum=scanner.nextLong();
				 System.out.println("Enter 3 digit CVV");
				 int cvv=scanner.nextInt();
				 if(cvv<=999) {
					System.out.println("You have successfully paid for the product");
					 
				 }
			 
				 else {
					 System.out.println("Invalid cvv");
					
				 }			
				break;
				case 2:System.out.println("Enter the product name");
						String name=scanner.next();
					String product_name="Apple";
					if(name==product_name)
					{
						System.out.println("Product Found");
					}
					else {
						
				     // ProductAdmin.searchProduct();
						System.out.println("Product not found");
					}
				break;
				case 3: 
					TestProduct.main(null);
				}
			}
		}
	//}
}
	
		

	
