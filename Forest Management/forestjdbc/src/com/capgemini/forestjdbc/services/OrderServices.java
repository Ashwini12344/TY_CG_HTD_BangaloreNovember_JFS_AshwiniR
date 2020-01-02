package com.capgemini.forestjdbc.services;

import java.util.List;

import com.capgemini.forestjdbc.bean.OrderBean;

public interface OrderServices {
	boolean addOrder(OrderBean bean);
	boolean deleteOrder(int orderno);
	public List<OrderBean> showOrder();

}
