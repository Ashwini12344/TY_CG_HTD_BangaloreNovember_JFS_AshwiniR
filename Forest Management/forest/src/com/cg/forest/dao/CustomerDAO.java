package com.cg.forest.dao;
import com.cg.forest.bean.CustomerBean;

public interface CustomerDAO {
	boolean addCustomer(CustomerBean bean);
	boolean modifyCustomer(String emai);
	boolean deleteCustomer(int custid);
	

}
