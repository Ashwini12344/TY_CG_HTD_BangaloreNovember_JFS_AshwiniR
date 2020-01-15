package com.capgemini.forestmgtboot.dao;

import java.util.List;

import com.capgemini.forestmgtboot.dto.CustomerBean;

public interface CustomerDAO {
	boolean addCustomer(CustomerBean bean);

	boolean modifyCustomer(CustomerBean bean);

	boolean deleteCustomer(int customerid);

	public List<CustomerBean> getAllCustomers();
	
	public CustomerBean getCustomer(int customerid);

}