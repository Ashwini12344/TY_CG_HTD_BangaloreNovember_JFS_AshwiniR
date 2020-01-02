package com.capgemini.forestjdbc.services;

import com.capgemini.forestjdbc.bean.CustomerBean;

public interface CustomerServices {

	public boolean addCustomer(CustomerBean bean);

	public boolean deleteCustomer(int custid);

	public boolean modifyCustomer(int custid,String email);

}
