package com.capgemini.fmshibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.fmshibernate.bean.Scheduler;

public class SchedulerDAOImpl implements SchedulerDAO {
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");

	@Override
	public boolean addSchedule(Scheduler bean) {
		boolean isAdd = false;
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = null;
		try {
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(bean);
			System.out.println("Scheduler added ..");
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
	public boolean modifySchedule(Scheduler sbean) {
		boolean isModified = false;
		EntityManager manager = entityManagerFactory.createEntityManager();
		Scheduler scheduler = manager.find(Scheduler.class, sbean);
		EntityTransaction transaction = manager.getTransaction();
		if (sbean != null) {
			try {
				transaction.begin();
				int id = sbean.getScheduleId();
				if (id > 0) {
					sbean.setScheduleId(id);
				}
				transaction.commit();
				isModified = true;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		manager.close();
		return isModified;

	}

	@Override
	public boolean deleteSchedule(int scheduleId) {
		boolean isDeleted = false;
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = null;
		Scheduler bean = manager.find(Scheduler.class, scheduleId);
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
	public List<Scheduler> getAllSchedules() {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		transaction = entityManager.getTransaction();
		transaction.begin();
		String jpql = "from Scheduler";
		Query query = entityManager.createQuery(jpql);
		@SuppressWarnings("unchecked")
		List<Scheduler> record = query.getResultList();
		for (Scheduler scheduler : record) {
			System.out.println(scheduler.toString());
		}
		entityManager.close();

		return record;
	}

	@Override
	public Scheduler getSchedule(int scheduleId) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		transaction = entityManager.getTransaction();
		transaction.begin();
		Scheduler bean = entityManager.find(Scheduler.class, scheduleId);
		entityManager.close();
		return bean;
	}

}
