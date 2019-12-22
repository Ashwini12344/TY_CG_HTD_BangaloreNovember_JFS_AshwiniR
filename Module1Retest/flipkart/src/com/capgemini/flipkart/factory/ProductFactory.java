package com.capgemini.flipkart.factory;

import com.capgemini.flipkart.dao.ProductDao;
import com.capgemini.flipkart.dao.ProductDaoImpl;

public class ProductFactory {
		
		public static ProductDao instanceOfProductDaoImpl() {
		
		ProductDao dao=new ProductDaoImpl();
		return dao;
		}

	}

