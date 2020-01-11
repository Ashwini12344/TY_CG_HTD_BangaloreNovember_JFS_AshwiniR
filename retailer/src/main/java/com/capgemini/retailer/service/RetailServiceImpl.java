package com.capgemini.retailer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailer.dao.RetailDAO;
import com.capgemini.retailer.dto.OrderInfo;
import com.capgemini.retailer.dto.ProductInfo;
import com.capgemini.retailer.dto.UserInfo;

@Service
public class RetailServiceImpl implements RetailService {
	@Autowired
	private RetailDAO dao;

	@Override
	public boolean createProfile(UserInfo user) {
		return dao.createProfile(user);
	}

	@Override
	public UserInfo login(String email, String password) {
		return dao.login(email, password);
	}

	@Override
	public ProductInfo getProduct(int id) {
		return dao.getProduct(id);
	}

	@Override
	public boolean updatePassword(UserInfo user,String password) {
		return dao.updatePassword(user,password);
	}

	@Override
	public List<OrderInfo> getAllOrders() {
		return dao.getAllOrders();
	}

}
