package com.capgemini.fmshibernate.details;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.capgemini.fmshibernate.bean.Product;
import com.capgemini.fmshibernate.controller.ForestMain;
import com.capgemini.fmshibernate.service.ProductService;
import com.capgemini.fmshibernate.service.ProductServiceImpl;

public class ProductDetails {
	public static void productDetails() {
		ProductService service = new ProductServiceImpl();

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.Add product details");
			System.out.println("2.Delete product details");
			System.out.println("3.Modify product details");
			System.out.println("4.show product");
			System.out.println("5.Back");
			Product bean1 = new Product();
			int ch2 = sc.nextInt();
			switch (ch2) {
			case 1:
				System.out.println("Enter Product id");
				int prodId = sc.nextInt();
				System.out.println("Enter product name");
				String prodName = sc.next();
				while (!prodName.matches("[a-zA-Z,]{3,15}+")) {
					System.err.println("Enter valid name");
					prodName = sc.next();

				}
				bean1.setProdId(prodId);
				bean1.setProdName(prodName);
				boolean check = service.addProduct(bean1);
				if (check) {
					System.out.println("Product added");
					System.out.println(bean1.toString());
				} else {
					System.out.println("something went wrong");
				}

				break;
			case 2:
				System.out.println("enter product id");
				int prodId1 = sc.nextInt();
				boolean check3 = service.deleteProduct(prodId1);
				if (check3) {
					System.out.println("Product deleted\n");
				} else {
					System.out.println("Product not found");
				}
				break;

			case 3:
				System.out.println("enter product id to update");
				int productId = sc.nextInt();
				System.out.println("enter product name to update");
				String prodName1 = sc.next();
				while (!prodName1.matches("[a-zA-Z,]{3,15}+")) {
					System.err.println("Enter valid name");
					prodName1 = sc.next();
				}
				boolean check1 = service.modifyProduct(prodName1);
				if (check1) {
					System.out.println("Product modified\n");
				} else {
					System.out.println("no product found");
				}
				break;
			case 4:
				List<Product> check2 = service.showProduct();
				System.out.println(check2);
				break;

			case 5:
				ForestMain.main(null);
				break;

			}

		}
	}

}