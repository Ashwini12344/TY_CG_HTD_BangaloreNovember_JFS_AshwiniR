package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateJPQL1 {
	public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction transaction=entityManager.getTransaction();
	transaction.begin();
	String jpql="update Movie set name=:nm where mid=:id";
	Query query=entityManager.createQuery(jpql);
	query.setParameter("id",101);
	query.setParameter("nm","Hello");
	int var=query.executeUpdate();
	System.out.println(var);
	transaction.commit();
	entityManager.close();

}
}
