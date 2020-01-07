package com.capgemini.fmshibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.fmshibernate.bean.Customer;
import com.capgemini.fmshibernate.bean.Product;

public class ProductDAOImpl implements ProductDAO{
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
	@Override
	public boolean addProduct(Product bean) {
	
		boolean isAdd=false;
		EntityManager manager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=null;	
		try {
			transaction=manager.getTransaction();
			transaction.begin();
	        manager.persist(bean);
			System.out.println("product added ..");
			transaction.commit();
			isAdd=true;	
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		manager.close();
		return isAdd;
	}

	@Override
	public boolean modifyProduct(String prodName) {
		boolean isModified=false;
		EntityManager manager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=null;	
		Product bean=manager.find(Product.class,prodName);
		if(bean!=null) {
			try {
				transaction.begin();
				String prodname=bean.getProdName().trim();
				if(prodName!=null && prodName.isEmpty()) {
					bean.setProdName(prodName);
				}
				transaction.commit();
				isModified=true;
			}catch(Exception e) {
				e.printStackTrace();
			}
				
			
		}
		
		manager.close();
		return isModified;
	}

	@Override
	public boolean deleteProduct(int prodId) {
		boolean isDeleted=false;
		EntityManager manager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=null;	
		Product bean=manager.find(Product.class,prodId);
		if(bean!=null) {
			transaction=manager.getTransaction();
			transaction.begin();
	        manager.remove(bean);
			transaction.commit();
			isDeleted=true;	
		}		
		manager.close();
		return isDeleted;

	}

	@Override
	public List<Product> showProduct() {
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			String jpql="from Product";
			Query query=entityManager.createQuery(jpql);
			List<Product> list=query.getResultList();
			for(Product product:list) {
			System.out.println(product.toString());
			}
			entityManager.close();
			return list;

		}

		
	}


