package com.capgemini.fmshibernate.dao;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.fmshibernate.bean.Contract;
import com.capgemini.fmshibernate.bean.LandBean;



public class LandDaoImpl implements LandDao{
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
	// Scanner sc = new Scanner(System.in);
	LandBean bean = new LandBean();


	@Override
	public List<LandBean> showAllLands() {
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			String jpql="from LandBean";
			Query query=entityManager.createQuery(jpql);
			List<LandBean> record=query.getResultList();
			for(LandBean land:record) {
			System.out.println(land.toString());
			}
			entityManager.close();

		return record;
	}

		
	

	@Override
	public boolean addLand(LandBean land) {
		boolean isAdd=false;
		EntityManager manager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=null;	
		try {
			transaction=manager.getTransaction();
			transaction.begin();
	        manager.persist(bean);
			System.out.println("land added ..");
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
	public boolean removeLand(int landId) {
		boolean isDeleted=false;
		EntityManager manager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=null;	
		LandBean bean=manager.find(LandBean.class,landId);
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
	
	
	
	
}