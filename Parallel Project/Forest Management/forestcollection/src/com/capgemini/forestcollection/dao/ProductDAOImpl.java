package com.capgemini.forestcollection.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.forestcollection.bean.ContractBean;
import com.capgemini.forestcollection.bean.CustomerBean;
import com.capgemini.forestcollection.bean.ProductBean;

public class ProductDAOImpl implements ProductDAO{
	Scanner sc=new Scanner(System.in);
	private List<ProductBean> bean1=new ArrayList<ProductBean>();

	@Override
	public boolean addProduct(ProductBean bean) {
		for (ProductBean productBean:bean1) {
			if(productBean.getProdId()==bean.getProdId()) {
				return false;
			}
			else {
				bean1.add(bean);
				return true;
				
				}
			
		}
		return true;
	}

	@Override
	public boolean modifyProduct(String ProdName) {
		for (ProductBean productBean : bean1) {
			if(productBean.getProdName()==ProdName) {
			productBean.setProdName(ProdName);
				
			}else {
				return false;
			}
		}
		
		return false;
	}

	@Override
	public boolean deleteProduct(int prodId) {
		
		ProductBean bean=null;
		for (ProductBean productBean : bean1) {
			if(productBean.getProdId()==prodId) {
				bean1.remove(bean);
				return true;
				}
			else {
				System.out.println("Product not found");
			}
		
			}
		return true;
		
		}

	
		}
			