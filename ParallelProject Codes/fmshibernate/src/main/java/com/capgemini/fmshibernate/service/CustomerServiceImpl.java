package com.capgemini.fmshibernate.service;

import java.util.List;

import com.capgemini.fmshibernate.bean.Customer;
import com.capgemini.fmshibernate.dao.ContractDAO;
import com.capgemini.fmshibernate.dao.ContractDAOImpl;
import com.capgemini.fmshibernate.dao.CustomerDAO;
import com.capgemini.fmshibernate.dao.CustomerDAOImpl;

public class CustomerServiceImpl  implements CustomerService{
	CustomerDAO dao=new CustomerDAOImpl();

	@Override
	public boolean addCustomer(Customer bean) {
		return dao.addCustomer(bean);
	}

	@Override
	public boolean deleteCustomer(int customerid) {
	
		return dao.deleteCustomer(customerid);
	}
	@Override
	public boolean modifyCustomer(int custid, String email) {
		
		return dao.modifyCustomer(email);
	}

	@Override
	public List<Customer> showCustomer() {
		
		return dao.showCustomer();
	}

}
