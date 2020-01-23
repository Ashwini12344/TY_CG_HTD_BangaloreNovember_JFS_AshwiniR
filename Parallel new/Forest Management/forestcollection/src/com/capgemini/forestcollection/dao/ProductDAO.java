package com.capgemini.forestcollection.dao;
import java.util.List;

import com.capgemini.forestcollection.bean.ProductBean;

public interface ProductDAO {
	boolean addProduct(ProductBean bean);
	boolean modifyProduct(String name);
	boolean deleteProduct(int prodId);

}
