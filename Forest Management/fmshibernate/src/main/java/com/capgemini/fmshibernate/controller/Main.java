package com.capgemini.fmshibernate.controller;

import java.util.Scanner;

import com.capgemini.fmshibernate.bean.Product;
import com.capgemini.fmshibernate.dto.ContractImpl;
import com.capgemini.fmshibernate.dto.CustomerImpl;
import com.capgemini.fmshibernate.dto.ProductImpl;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.Add Contract\n2.Delete Contract\n3.show contract\n4.Back");
			int op=sc.nextInt();
			switch(op) {
			case 1:ContractImpl.addContract();
			break;
			case 2:ContractImpl.deleteContract(102);
			break;
			case 3:ContractImpl.showAllContract();
			break;
			case 4:Main.main(null);
			}
			while(true) {
			System.out.println("1.Add customer\n2.Delete customer\n3.Show customer\n4.update\n5.Back");
			int option=sc.nextInt();
			switch(option) {
			case 1:CustomerImpl.addCustomer();
			break;
			case 2:CustomerImpl.deleteCustomer(103);
				   
			case 3:CustomerImpl.showAllCustomer();
			break;
			case 4:CustomerImpl.update();
			break;
			case 5:Main.main(null);
			}
			while(true) {
			System.out.println("1.Add Product\n2.Delete Product\n3.Show product\n4.update product\n5.Back");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:ProductImpl.addProduct();
			break;
			case 2:ProductImpl.deleteProduct(103);
				   
			case 3:ProductImpl.showAllProduct();
			break;
			case 4:ProductImpl.update();
			break;
			case 5:Main.main(null);
			}
			}
		}
	}
	}
}

