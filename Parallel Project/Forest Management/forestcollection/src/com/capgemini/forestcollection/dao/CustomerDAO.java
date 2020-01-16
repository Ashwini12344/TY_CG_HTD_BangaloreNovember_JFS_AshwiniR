package com.capgemini.forestcollection.dao;
import com.capgemini.forestcollection.bean.CustomerBean;

public interface CustomerDAO {
	boolean addCustomer(CustomerBean bean);
	boolean modifyCustomer(String emai);
	boolean deleteCustomer(int custid);
	

}
