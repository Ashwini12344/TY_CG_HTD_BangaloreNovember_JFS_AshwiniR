package com.capgemini.fmshibernate.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.fmshibernate.bean.Contract;

public class ContractDAOImpl implements ContractDAO {
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
	// Scanner sc = new Scanner(System.in);
	Contract bean = new Contract();

	@Override
	public boolean addContractor(Contract bean) {
		boolean isAdd=false;
		EntityManager manager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=null;	
		try {
			transaction=manager.getTransaction();
			transaction.begin();
	        manager.persist(bean);
			System.out.println("contractor added ..");
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
	public boolean deleteContractor(int contractNo) {
		boolean isDeleted=false;
		EntityManager manager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=null;	
		Contract bean=manager.find(Contract.class,contractNo);
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
	public List<Contract> showContract() {
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			String jpql="from Contract";
			Query query=entityManager.createQuery(jpql);
			List<Contract> record=query.getResultList();
			for(Contract contract:record) {
			System.out.println(contract.toString());
			}
			entityManager.close();

		return record;
	}

}
