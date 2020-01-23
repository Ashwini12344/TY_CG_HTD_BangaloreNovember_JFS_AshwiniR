package com.capgemini.forestcollection.manager;

import com.capgemini.forestcollection.dao.ProductDAO;
import com.capgemini.forestcollection.dao.ProductDAOImpl;

public class ProductDAOManager {
	public static ProductDAO getProductDAO() {
		return new ProductDAOImpl();
	}
}
