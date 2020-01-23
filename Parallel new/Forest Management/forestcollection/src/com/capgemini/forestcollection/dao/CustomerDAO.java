package com.capgemini.forestcollection.dao;
import com.capgemini.forestcollection.bean.CustomerBean;

public interface CustomerDAO {
	boolean addCustomer(CustomerBean bean);
	boolean modifyCustomer(String email);
	boolean deleteCustomer(int custId);
	

}
