package com.capgemini.jdbc.controller;
import java.util.*;
import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.services.UserServices;

public class GetAllUsers {
	public static void main(String[] args) {
		UserServices services=UserFactory.instanceOfUserServices();
		List<UserBean> list=services.getAllUsers();
		if(list!=null) {
			for (UserBean user : list) {
				System.out.println(user);
			}
		}
	}

}
