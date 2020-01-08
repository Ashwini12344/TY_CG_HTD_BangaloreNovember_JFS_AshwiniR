package com.capgemini.fmshibernate.dao;

import java.util.List;

import com.capgemini.fmshibernate.bean.Product;

public interface ProductDAO {
	boolean addProduct(Product bean);

	boolean modifyProduct(String name);

	boolean deleteProduct(int prodId);

	public List<Product> showProduct();

}
