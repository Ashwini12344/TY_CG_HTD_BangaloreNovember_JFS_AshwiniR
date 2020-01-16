package com.capgemini.forestcollection.dao;

import java.util.*;

import com.capgemini.forestcollection.bean.CustomerBean;

public class CustomerDAOImpl implements CustomerDAO {
	Scanner sc = new Scanner(System.in);
	private List<CustomerBean> bean1 = new ArrayList<CustomerBean>();

	@Override
	public boolean addCustomer(CustomerBean bean) {

		for (CustomerBean customerBean : bean1) {
			if (customerBean.getCustid() == bean.getCustid()) {
				return false;
			} else {
				bean1.add(bean);
				return true;

			}

		}
		return true;

	}

	@Override
	public boolean modifyCustomer(String email) {
		for (CustomerBean customerBean : bean1) {
			if (customerBean.getEmail() == email) {
				customerBean.setEmail(sc.next());

			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean deleteCustomer(int custid) {
		CustomerBean bean = null;
		for (CustomerBean customerBean : bean1) {
			if (customerBean.getCustid() == custid) {
				bean = customerBean;
			}

			else if (bean != null) {
				bean1.remove(bean);
				return true;

			}

		}

		return false;
	}

}
