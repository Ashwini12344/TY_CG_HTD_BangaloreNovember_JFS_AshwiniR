package com.capgemini.jdbc.factory;

import com.capgemini.jdbc.dao.UserDAO;
import com.capgemini.jdbc.dao.UserDAOImp;
import com.capgemini.jdbc.services.UserServices;
import com.capgemini.jdbc.services.UserServicesImp;

public class UserFactory {
	private UserFactory() {
		
	}
	public static UserDAO instanceOfUserDAOImp() {
		UserDAO dao= new UserDAOImp();
		return dao;
	}
public static  UserServices instanceOfUserServices() {
	UserServices services=new UserServicesImp();
	return services;
}
}
