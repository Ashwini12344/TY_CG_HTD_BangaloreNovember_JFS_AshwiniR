package com.capgemini.retailer.dao;

import java.util.List;

import com.capgemini.retailer.dto.OrderInfo;
import com.capgemini.retailer.dto.ProductInfo;
import com.capgemini.retailer.dto.UserInfo;

public interface RetailDAO {
	public boolean createProfile(UserInfo user);

	public UserInfo login(String email, String password);

	public ProductInfo getProduct(int id);

	public boolean updatePassword(UserInfo user,String password);
	
	public List<OrderInfo> getAllOrders();

}
