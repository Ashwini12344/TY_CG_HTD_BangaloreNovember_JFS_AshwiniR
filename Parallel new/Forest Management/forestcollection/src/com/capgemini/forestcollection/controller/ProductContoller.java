package com.capgemini.forestcollection.controller;

import java.util.Scanner;

import com.capgemini.forestcollection.bean.ProductBean;
import com.capgemini.forestcollection.dao.ProductDAO;
import com.capgemini.forestcollection.manager.ProductDAOManager;

public class ProductContoller {
	public static void productDetails() {
		ProductDAO dao1=ProductDAOManager.getProductDAO();
		while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Add product details");
		System.out.println("2.Delete product details");
		System.out.println("3.Modify product details");
		ProductBean bean1=new ProductBean();
		int ch2=sc.nextInt();
		switch(ch2) {
		case 1:System.out.println("Enter Product id");
				int prodId=sc.nextInt();
				System.out.println("Enter product name");
				String prodName=sc.next();
				while(!prodName.matches("[a-zA-Z,]{3,15}+")) {
				    System.err.println("Enter valid name");
				    String prodname1=sc.next();
				    break;
					}
				System.out.println("Enter product description");
				String prodDescription=sc.next();
				System.out.println("Enter product cost");
				double cost=sc.nextDouble();
				bean1.setProdId(prodId);
				bean1.setProdName(prodName);
				bean1.setProdDescription(prodDescription);
				bean1.setCost(cost);
				boolean check=dao1.addProduct(bean1);
				if(check) {
					System.out.println("Product added");
					System.out.println(bean1.toString());
				}
				else {
					System.out.println("something went wrong");
				}

				break;
				case 2:System.out.println("enter product id");
				int prodId1=sc.nextInt();
				boolean check3=dao1.deleteProduct(prodId1);
				if(check3) {
					System.out.println("Product deleted\n");
				}
				else {
					System.out.println("no user found");
				}
				break;
				
				case 3:System.out.println("enter product id to update");
				int productId=sc.nextInt();
				System.out.println("enter product name to update");
				String prodname=sc.next();
				while(!prodname.matches("[a-zA-Z,]{3,15}+")) {
				    System.err.println("Enter valid name");
				    prodname=sc.next();
				   
					}
				boolean check1=dao1.modifyProduct(prodname);
				if(check1) {
					System.out.println("Product deleted\n");
				}
				else {
					System.out.println("no product found");
				}
				break;
		
				
		
	}

}
	}
}



