package com.capgemini.fmshibernate.service;

import java.util.List;

import com.capgemini.fmshibernate.bean.Contract;
import com.capgemini.fmshibernate.bean.Customer;

public interface CustomerService {
	public boolean addCustomer(Customer bean);

	public boolean deleteCustomer(int custid);

	public boolean modifyCustomer(int custid, String email);

	public List<Customer> showCustomer();

}
