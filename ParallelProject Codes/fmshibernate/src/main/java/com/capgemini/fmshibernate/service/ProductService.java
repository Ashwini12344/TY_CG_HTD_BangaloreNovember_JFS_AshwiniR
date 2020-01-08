package com.capgemini.fmshibernate.service;

import java.util.List;

import com.capgemini.fmshibernate.bean.Product;



public interface ProductService {
	public boolean addProduct(Product bean);

	public boolean deleteProduct(int prodId);

	public boolean modifyProduct(String prodname);
	
	public  List<Product> showProduct();

}
