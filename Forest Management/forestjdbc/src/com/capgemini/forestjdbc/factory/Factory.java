package com.capgemini.forestjdbc.factory;

import com.capgemini.forestjdbc.dao.ContractDAO;

import com.capgemini.forestjdbc.dao.ContractDAOImpl;
import com.capgemini.forestjdbc.dao.CustomerDAO;
import com.capgemini.forestjdbc.dao.CustomerDAOImpl;
import com.capgemini.forestjdbc.dao.OrderDAO;
import com.capgemini.forestjdbc.dao.OrderDAOImpl;
import com.capgemini.forestjdbc.dao.ProductDAO;
import com.capgemini.forestjdbc.dao.ProductDAOImpl;
import com.capgemini.forestjdbc.services.ContractServices;
import com.capgemini.forestjdbc.services.ContractServicesImpl;
import com.capgemini.forestjdbc.services.CustomerServiceImpl;
import com.capgemini.forestjdbc.services.CustomerServices;
import com.capgemini.forestjdbc.services.OrderServiceImpl;
import com.capgemini.forestjdbc.services.OrderServices;
import com.capgemini.forestjdbc.services.ProductServiceImpl;
import com.capgemini.forestjdbc.services.ProductServices;

public class Factory {
	private Factory() {
		
	}

	public static ContractDAO instanceOfContractDAOImpl() {
		ContractDAO dao=new ContractDAOImpl();
		return dao;
	}
	public static ContractServices instanceOfContractServices() {
		ContractServices service=new ContractServicesImpl();
		return service;
	}
	public static CustomerDAO instanceOfCustomerDAOImpl() {
	CustomerDAO dao=new CustomerDAOImpl();
	return dao;
	}

	public static CustomerServices instanceOfCustomerServices() {
	CustomerServices service=new CustomerServiceImpl();
	return service;
	}

	public static ProductServices instanceOfProductServices() {
	ProductServices service=new ProductServiceImpl();
		return service;
	}

	public static ProductDAO instanceOfProductDAOImpl() {
	ProductDAO dao=new ProductDAOImpl();
		return dao;
	}
	public static OrderDAO instanceOfOrderDAOImpl() {
		OrderDAO dao=new OrderDAOImpl();
		return dao;
		}
	public static OrderServices instanceOfOrderServices() {
		OrderServices service=new OrderServiceImpl();
			return service;
		}

	
	}


	


