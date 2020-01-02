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
public class CustomerImpl {
	static Scanner sc=new Scanner(System.in);
	public static void addCustomer() {
		System.out.println("Enter Customer id");
		int custid=sc.nextInt();
		System.out.println("Enter customer name");
		String custname=sc.next();
		while(!custname.matches("[a-zA-Z,]{3,15}+")) {
			System.err.println("Enter valid name");
			custname=sc.next();
		}
		System.out.println("Enter street address1");
		String street1=sc.next();
		System.out.println("Enter street address2");
		String street2=sc.next();
		System.out.println("Enter the town");
		String town=sc.next();
		System.out.println("Enter pincode");
		String pin=sc.next();
		while(!pin.matches("^[0-9]{6}$")) {
			System.err.println("Enter valid pincode");
			pin=sc.next();

		}
		System.out.println("Enter email");
		String email=sc.next();
		while(!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {	
			System.out.println("Enter valid email");
			email=sc.next();
		}
		System.out.println("Enter telno");
		String tel=sc.next();
		while(!tel.matches("^[0-9]{10}$"))
		{
			System.out.println("Enter 10 digit phone number");
			tel=sc.next();

		}
		Customer customer=new Customer();
		customer.setCustomerid(custid);
		customer.setCustomer_name(custname);
		customer.setStreet_address1(street1);
		customer.setStreet_address2(street2);
		customer.setPostal_code(pin);
		customer.setTown(town);
		customer.setEmail(email);
		customer.setTelephone(tel);
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(customer);
			System.out.println("customer added successfully..");
			transaction.commit();
			entityManager.close();
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
	}
	public static void deleteCustomer(int customerid) {
		Customer customer=new Customer();
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			System.out.println("Enter custid to delete");
			customerid=sc.nextInt();
			Customer record=entityManager.find(Customer.class,customerid);
			entityManager.remove(record);
			System.out.println("customer removed");
			transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		
		entityManager.close();
	}
	public static void showAllCustomer() {
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			String jpql="from Customer";
			Query query=entityManager.createQuery(jpql);
			List<Customer> record=query.getResultList();
			for(Customer customer:record) {
			System.out.println(customer.toString());
			}
			entityManager.close();

		}
	public static void update() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		String jpql="update Customer set customer_name='santhosh' where customerid=1";
		Query query=entityManager.createQuery(jpql);
		int var=query.executeUpdate();
		transaction.commit();
		entityManager.close();
		
	}
}

