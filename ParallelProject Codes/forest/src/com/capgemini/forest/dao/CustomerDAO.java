package com.capgemini.forest.dao;
import com.capgemini.forest.bean.CustomerBean;

public interface CustomerDAO {
	boolean addCustomer(CustomerBean bean);
	boolean modifyCustomer(String emai);
	boolean deleteCustomer(int custid);
	

}