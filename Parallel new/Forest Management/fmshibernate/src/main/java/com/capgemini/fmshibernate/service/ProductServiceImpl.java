package com.capgemini.fmshibernate.service;

import java.util.List;

import com.capgemini.fmshibernate.bean.Product;
import com.capgemini.fmshibernate.dao.ProductDAO;
import com.capgemini.fmshibernate.dao.ProductDAOImpl;

public class ProductServiceImpl implements ProductService{
	ProductDAO dao=new ProductDAOImpl();
	@Override
	public boolean addProduct(Product bean) {
		return dao.addProduct(bean);
	}

	@Override
	public boolean deleteProduct(int prodId) {
		return dao.deleteProduct(prodId);
	}

	@Override
	public boolean modifyProduct(String prodName) {
		return dao.modifyProduct(prodName);
	}

	@Override
	public List<Product> showProduct() {
		return dao.showProduct();
	}

}
