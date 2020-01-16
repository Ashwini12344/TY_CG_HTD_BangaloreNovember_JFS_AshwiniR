package com.capgemini.forestjdbc.services;

import java.util.List;

import com.capgemini.forestjdbc.bean.CustomerBean;
import com.capgemini.forestjdbc.bean.ProductBean;

public interface ProductServices {

	public boolean addProduct(ProductBean bean);

	public boolean deleteProduct(int prodId);

	public boolean modifyProduct(String prodname);
	
	public  List<ProductBean> showProduct();
	
}
