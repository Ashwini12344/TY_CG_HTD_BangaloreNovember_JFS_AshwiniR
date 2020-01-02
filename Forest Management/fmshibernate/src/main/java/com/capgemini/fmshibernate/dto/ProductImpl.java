package com.capgemini.fmshibernate.dto;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.fmshibernate.bean.Contract;
import com.capgemini.fmshibernate.bean.Customer;
import com.capgemini.fmshibernate.bean.Product;

public class ProductImpl {
static Scanner sc=new Scanner(System.in);

	
	public static void addProduct() {
		System.out.println("enter product id");
		int prodid=sc.nextInt();
		System.out.println("enter product name");
		String prodName=sc.next();
		Product product=new Product();
		product.setProdId(prodid);
		product.setProdName(prodName);
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(product);
			System.out.println("product added successfully..");
			transaction.commit();
			entityManager.close();
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
	}
	public static void deleteProduct(int prodid) {
		Product product=new Product();
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			System.out.println("Enter prodid to delete");
			prodid=sc.nextInt();
			Customer record=entityManager.find(Customer.class,prodid);
			entityManager.remove(record);
			System.out.println("product removed");
			transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		
		entityManager.close();
	}
	public static void showAllProduct() {
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			String jpql="from Product";
			Query query=entityManager.createQuery(jpql);
			List<Product> record=query.getResultList();
			for(Product product:record) {
			System.out.println(product.toString());
			}
			entityManager.close();

		}
	public static void update() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		String jpql="update Product set prodName='redmiPro' where prodId=1";
		Query query=entityManager.createQuery(jpql);
		int var=query.executeUpdate();
		transaction.commit();
		entityManager.close();
		
	}

		}

