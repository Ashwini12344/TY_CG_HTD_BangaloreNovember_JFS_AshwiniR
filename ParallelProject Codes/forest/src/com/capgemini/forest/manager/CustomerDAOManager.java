package com.capgemini.forest.manager;

import com.capgemini.forest.dao.ContractDAO;
import com.capgemini.forest.dao.ContractDAOImpl;
import com.capgemini.forest.dao.CustomerDAO;
import com.capgemini.forest.dao.CustomerDAOImpl;

public class CustomerDAOManager {
	public static CustomerDAO getContractDAO() {
		return new CustomerDAOImpl();
	}

	public static CustomerDAO getCustomerDAO() {

		return new CustomerDAOImpl();
	}

}