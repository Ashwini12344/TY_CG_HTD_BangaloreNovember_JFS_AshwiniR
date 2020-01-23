package com.capgemini.forestcollection.manager;

import com.capgemini.forestcollection.dao.ContractDAO;
import com.capgemini.forestcollection.dao.ContractDAOImpl;
import com.capgemini.forestcollection.dao.CustomerDAO;
import com.capgemini.forestcollection.dao.CustomerDAOImpl;

public class CustomerDAOManager {
	public static CustomerDAO getContractDAO() {
		return new CustomerDAOImpl();
	}

	public static CustomerDAO getCustomerDAO() {

		return new CustomerDAOImpl();
	}

}
