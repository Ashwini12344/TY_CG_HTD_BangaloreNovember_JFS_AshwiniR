package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class GetReference {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Movie record=entityManager.getReference(Movie.class,101);
		System.out.println(record.getClass());
		System.out.println("Id"+record.getMid());
		System.out.println("Name"+record.getName());
		System.out.println("Rating"+record.getRating());
		entityManager.close();

	}

}
