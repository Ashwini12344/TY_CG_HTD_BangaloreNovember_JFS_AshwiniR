package com.capgemini.forestjdbc.dao;

import java.util.List;

import com.capgemini.forestjdbc.bean.CustomerBean;
import com.capgemini.forestjdbc.bean.ProductBean;
import com.capgemini.forestjdbc.bean.SchedulerBean;

public interface CustomerDAO {
	boolean addCustomer(CustomerBean bean);

	boolean deleteCustomer(int custId);

	boolean modifyCustomer(CustomerBean bean);

	public CustomerBean getCustomer(int customerid);

	public List<CustomerBean> showCustomer();

}
