package com.capgemini.forestmgtboot.dao;

import java.util.List;

import com.capgemini.forestmgtboot.dto.ProductBean;

public interface ProductDao {
	boolean addProduct(ProductBean bean);

	boolean modifyProduct(ProductBean bean);

	boolean deleteProduct(int prodId);

	public List<ProductBean> getAllProducts();
	
	public ProductBean getProduct(int prodId);

}
