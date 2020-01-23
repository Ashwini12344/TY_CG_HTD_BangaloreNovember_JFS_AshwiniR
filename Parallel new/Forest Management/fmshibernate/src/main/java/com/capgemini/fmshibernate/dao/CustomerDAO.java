package com.capgemini.fmshibernate.dao;

import java.util.List;

import com.capgemini.fmshibernate.bean.Customer;

public interface CustomerDAO {
	boolean addCustomer(Customer bean);

	boolean modifyCustomer(Customer bean);

	boolean deleteCustomer(int customerid);

	public List<Customer> showCustomer();

}
