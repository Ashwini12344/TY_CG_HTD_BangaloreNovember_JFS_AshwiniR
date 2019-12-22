package com.capgemini.flipkart.dao;

import java.util.List;

import com.capgemini.flipkart.beans.ProductBean;

public interface ProductDao {
	public  List<ProductBean> showProduct();
	public  boolean searchProduct(String name);
	public  boolean buyProduct(long cardnum,int cvv);
}


