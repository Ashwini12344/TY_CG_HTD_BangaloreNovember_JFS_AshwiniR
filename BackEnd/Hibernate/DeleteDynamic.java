package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteDynamic {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		String jpql="Delete from Movie where mid=:id";
		Query query=entityManager.createQuery(jpql);
		query.setParameter("id",102);
		//query.setParameter("nm","Hello");
		int var=query.executeUpdate();
		System.out.println(var);
		transaction.commit();
		entityManager.close();

	}
	}


