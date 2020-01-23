package com.capgemini.fmshibernate.service;

import java.util.List;

import com.capgemini.fmshibernate.bean.Contract;
import com.capgemini.fmshibernate.bean.Customer;

public interface CustomerService {
	public boolean addCustomer(Customer bean);

	public boolean deleteCustomer(int custid);

	public boolean modifyCustomer(Customer bean);

	public List<Customer> showCustomer();

}
