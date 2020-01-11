package com.capgemini.retailer.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.retailer.dto.OrderInfo;
import com.capgemini.retailer.dto.ProductInfo;
import com.capgemini.retailer.dto.UserInfo;
import com.capgemini.retailer.exception.RetailException;

@Repository
public class RetailDAOImpl implements RetailDAO {
	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public boolean createProfile(UserInfo user) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		user = new UserInfo();
		try {
			transaction.begin();
			manager.persist(user);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public UserInfo login(String email, String password) {
		EntityManager manager = factory.createEntityManager();
		UserInfo user = manager.find(UserInfo.class, email);
		return user;

	}

	@Override
	public ProductInfo getProduct(int id) {
		EntityManager manager = factory.createEntityManager();
		ProductInfo product = manager.find(ProductInfo.class, id);
		return product;

	}

	@Override
	public boolean updatePassword(UserInfo user, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		user = manager.find(UserInfo.class, password);
		user.setPassword(user.getPassword());
		transaction.commit();
		return true;

	}

	@Override
	public List<OrderInfo> getAllOrders() {
		EntityManager manager = factory.createEntityManager();
		String getall = "from OrderInfo";
		TypedQuery<OrderInfo> query = manager.createQuery(getall, OrderInfo.class);
		return query.getResultList();
	}

}
