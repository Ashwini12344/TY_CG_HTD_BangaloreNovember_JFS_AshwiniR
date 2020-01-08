package com.capgemini.forestjdbc.dao;

import java.util.List;

import com.capgemini.forestjdbc.bean.CustomerBean;
import com.capgemini.forestjdbc.bean.ProductBean;

public interface CustomerDAO {
	boolean addCustomer(CustomerBean bean);
	boolean deleteCustomer(int cudtid);
	//boolean modifyCustomer(int custid,String email);
	boolean modifyCustomer(CustomerBean bean);
	public  List<CustomerBean> showCustomer();

}
