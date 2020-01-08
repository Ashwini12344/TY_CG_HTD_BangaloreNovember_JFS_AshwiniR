package com.capgemini.forestjdbc.services;

import java.util.List;

import com.capgemini.forestjdbc.bean.OrderBean;
import com.capgemini.forestjdbc.dao.CustomerDAO;
import com.capgemini.forestjdbc.dao.OrderDAO;
import com.capgemini.forestjdbc.factory.Factory;

public class OrderServiceImpl implements OrderServices {
	OrderDAO dao=Factory.instanceOfOrderDAOImpl();
	


	@Override
	public boolean addOrder(OrderBean bean) {
		return dao.addOrder(bean) ;
	}

	@Override
	public boolean deleteOrder(int orderno) {
		return dao.deleteOrder(orderno);
	}

	@Override
	public List<OrderBean> showOrder() {

		return dao.showOrder();
	}

}
