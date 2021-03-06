package com.capgemini.fmshibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.fmshibernate.bean.Customer;

public class CustomerDAOImpl implements CustomerDAO {
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");

	@Override
	public boolean addCustomer(Customer bean) {
		boolean isAdd = false;
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = null;
		try {
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(bean);
			System.out.println("customer added ..");
			transaction.commit();
			isAdd = true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		manager.close();
		return isAdd;

	}

	@Override
	public boolean modifyCustomer(Customer bean) {
		boolean isModified = false;
		EntityManager manager = entityManagerFactory.createEntityManager();
		Customer customer = manager.find(Customer.class, bean);
		EntityTransaction transaction = manager.getTransaction();
		if (bean != null) {
			try {
				transaction.begin();
				int id = bean.getCustomerid();
				if (id > 0) {
					bean.setCustomerid(id);
				}
				transaction.commit();
				isModified = true;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		manager.close();
		return false;
	}

	@Override
	public boolean deleteCustomer(int customerid) {
		boolean isDeleted = false;
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = null;
		Customer bean = manager.find(Customer.class, customerid);
		if (bean != null) {
			transaction = manager.getTransaction();
			transaction.begin();
			manager.remove(bean);
			transaction.commit();
			isDeleted = true;
		}
		manager.close();
		return isDeleted;
	}

	@Override
	public List<Customer> showCustomer() {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		transaction = entityManager.getTransaction();
		transaction.begin();
		String jpql = "from Customer";
		Query query = entityManager.createQuery(jpql);
		List<Customer> list = query.getResultList();
		for (Customer customer : list) {
			System.out.println(customer.toString());
		}
		entityManager.close();
		return list;

	}

}
