package com.capgemini.forestjdbc.services;

import java.util.List;

import com.capgemini.forestjdbc.bean.CustomerBean;

public interface CustomerServices {

	public boolean addCustomer(CustomerBean bean);

	public boolean deleteCustomer(int custid);

	// public boolean modifyCustomer(int custid,String email);
	public boolean modifyCustomer(CustomerBean bean);

	public List<CustomerBean> showCustomer();

	public CustomerBean getCustomer(int customerid);

}
