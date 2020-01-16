package com.capgemini.forestjdbc.services;

import java.util.List;

import com.capgemini.forestjdbc.bean.ProductBean;
import com.capgemini.forestjdbc.dao.ContractDAO;
import com.capgemini.forestjdbc.dao.ProductDAO;
import com.capgemini.forestjdbc.factory.Factory;

public class ProductServiceImpl implements ProductServices {
	ProductDAO dao=Factory.instanceOfProductDAOImpl();
	
	@Override
	public boolean addProduct(ProductBean bean) {
		return dao.addProduct(bean);
		
	}

	@Override
	public boolean deleteProduct(int prodid) {
		return dao.deleteProduct(prodid);
		
	}

	@Override
	public boolean modifyProduct( String prodname) {
		return dao.modifyProduct(prodname);
		
	}

	@Override
	public List<ProductBean> showProduct() {
		// TODO Auto-generated method stub
		return dao.showProduct();
	}


		
	

}
