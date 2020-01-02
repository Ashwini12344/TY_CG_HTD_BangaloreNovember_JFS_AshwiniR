package com.cg.forest.manager;

import com.cg.forest.dao.ContractDAO;
import com.cg.forest.dao.ContractDAOImpl;
import com.cg.forest.dao.CustomerDAO;
import com.cg.forest.dao.CustomerDAOImpl;

public class CustomerDAOManager {
	public static CustomerDAO getContractDAO() {
		return new CustomerDAOImpl();
	}

	public static CustomerDAO getCustomerDAO() {

		return new CustomerDAOImpl();
	}

}
