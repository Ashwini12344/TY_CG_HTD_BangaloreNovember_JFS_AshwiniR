package com.capgemini.flipkart.home;

import java.util.Scanner;

import com.capgemini.flipkart.controller.ProductAdmin;
import com.capgemini.flipkart.dao.ProductDao;
import com.capgemini.flipkart.dao.ProductDaoImpl;

public class TestProduct {
	public static void main(String[] args) {
		while(true) {
			Scanner sc=new Scanner(System.in);
		    System.out.println("1.Press 1 to show all products\n2.Press 2 to search  product\n");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:ProductAdmin.showProduct();
			break;
			case 2:
				ProductAdmin.searchProduct();
			break;
			
			
		}
	
	}
		}
	}


