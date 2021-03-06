package com.capgemini.forestmgtboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.forestmgtboot.dao.ProductDao;
import com.capgemini.forestmgtboot.dto.ProductBean;
@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao dao;

	@Override
	public boolean addProduct(ProductBean bean) {

		return dao.addProduct(bean);
	}

	@Override
	public ProductBean getProduct(int prodId) {
		
		return dao.getProduct(prodId);
	}

	@Override
	public List<ProductBean> getAllProducts() {
		
		return dao.getAllProducts();
	}

	@Override
	public boolean deleteProduct(int prodId) {
		
		return dao.deleteProduct(prodId);
	}

	@Override
	public boolean modifyProduct(ProductBean bean) {
		// TODO Auto-generated method stub
		return false;
	}
}
