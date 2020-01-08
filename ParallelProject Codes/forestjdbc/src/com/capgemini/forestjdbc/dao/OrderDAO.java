package com.capgemini.forestjdbc.dao;

import java.util.List;

import com.capgemini.forestjdbc.bean.ContractBean;
import com.capgemini.forestjdbc.bean.OrderBean;

public interface OrderDAO {
	boolean addOrder(OrderBean bean);
	boolean deleteOrder(int orderno);
	public List<OrderBean> showOrder();

}
