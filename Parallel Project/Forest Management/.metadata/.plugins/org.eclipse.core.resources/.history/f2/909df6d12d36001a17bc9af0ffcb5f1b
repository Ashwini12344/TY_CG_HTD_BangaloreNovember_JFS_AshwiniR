package com.capgemini.forestmgtboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.forestmgtboot.dao.ContractDAO;
import com.capgemini.forestmgtboot.dao.CustomerDAO;
import com.capgemini.forestmgtboot.dto.CustomerBean;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDAO dao;

	@Override
	public boolean addCustomer(CustomerBean bean) {
		return dao.addCustomer(bean);
	}

	@Override
	public boolean modifyCustomer(CustomerBean bean) {
		return dao.modifyCustomer(bean);
	}

	@Override
	public boolean deleteCustomer(int customerid) {
		return dao.deleteCustomer(customerid);
	}

	@Override
	public List<CustomerBean> getAllCustomers() {
		return dao.getAllCustomers();
	}

	@Override
	public CustomerBean getCustomer(int customerid) {
		return dao.getCustomer(customerid);
	}

}
