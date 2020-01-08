package com.capgemini.forestjdbc.dao;
import java.util.List;

import com.capgemini.forestjdbc.bean.ProductBean;

public interface ProductDAO {

    public boolean modifyProduct(String prodname);
	public boolean addProduct(ProductBean product);
	public boolean deleteProduct(int prodId);
	public  List<ProductBean> showProduct();

}
