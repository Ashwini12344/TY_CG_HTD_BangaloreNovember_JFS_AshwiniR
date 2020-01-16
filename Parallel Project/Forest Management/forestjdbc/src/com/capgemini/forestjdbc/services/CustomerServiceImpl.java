package com.capgemini.forestjdbc.services;

import java.util.List;

import com.capgemini.forestjdbc.bean.CustomerBean;
import com.capgemini.forestjdbc.dao.ContractDAO;
import com.capgemini.forestjdbc.dao.CustomerDAO;
import com.capgemini.forestjdbc.factory.Factory;

public class CustomerServiceImpl implements CustomerServices {
	CustomerDAO dao=Factory.instanceOfCustomerDAOImpl();
	

	@Override
	public boolean addCustomer(CustomerBean bean) {
		return dao.addCustomer(bean);
	
	}

	@Override
	public boolean deleteCustomer(int custid) {
		return dao. deleteCustomer(custid);
	}

	@Override
	public boolean modifyCustomer(CustomerBean bean) {
		// TODO Auto-generated method stub
		return dao.modifyCustomer(bean);
	}

	@Override
	public List<CustomerBean> showCustomer() {
		// TODO Auto-generated method stub
		return dao.showCustomer();
	}

//	@Override
//	public boolean modifyCustomer(int custid,String email) {
//			return dao.modifyCustomer(custid, email);
//}

}
