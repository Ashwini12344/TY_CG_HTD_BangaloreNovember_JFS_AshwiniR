package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.services.UserServices;

public class UpdateUser {
	public static void main(String[] args) {
		UserServices services=UserFactory.instanceOfUserServices();
		UserBean user=new UserBean();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter userid");
        user.setUserid(Integer.parseInt(sc.nextLine()));
		System.out.println("enter password to update");
	    user.setPassword(sc.nextLine());
		System.out.println("enter new email");
		user.setEmail(sc.nextLine());
		boolean result = services.updateUser(user.getUserid(),user.getPassword(),user.getEmail());
		if(result)
		{
			System.out.println("user email updated");
		}
		else
		{
			System.err.println("something went wrong");
		}
		
	}

}
