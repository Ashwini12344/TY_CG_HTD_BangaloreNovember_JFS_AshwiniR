package com.capgemini.fmshibernate.dto;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.fmshibernate.bean.Contract;

public class ContractImpl {
	static Scanner sc=new Scanner(System.in);

	
	public static void addContract() {
		System.out.println("enter Contract no");
		int contractno=sc.nextInt();
		System.out.println("enter customer-id");
		int custid=sc.nextInt();
		System.out.println("enter product-id");
		int prodid=sc.nextInt();
		System.out.println("enter Haulier-id");
		int haulid=sc.nextInt();
		System.out.println("enter delivery date");
		String deliverydate=sc.next();
		while(!deliverydate.matches("^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{2,4}+")) {
			System.out.println("Enter valid date");
			deliverydate=sc.next();
			
		}
		System.out.println("enter delivery day");
		String deliveryday=sc.next();
		System.out.println("enter quantity");
		int quantity=sc.nextInt();
		
			Contract contract=new Contract();
			contract.setContract_no(contractno);
			contract.setCustomerid(custid);
			contract.setHaulid(haulid);
			contract.setProductid(prodid);;
			contract.setDelivery_date(deliverydate);
			contract.setDelivery_day(deliveryday);
			contract.setQuantity(quantity);
			EntityManager entityManager=null;
			EntityTransaction transaction=null;
			try {
				EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
				entityManager=entityManagerFactory.createEntityManager();
				transaction=entityManager.getTransaction();
				transaction.begin();
				entityManager.persist(contract);
				System.out.println("contractor added ..");
				transaction.commit();
				entityManager.close();
			}catch(Exception e) {
				e.printStackTrace();
				transaction.rollback();
			}
			entityManager.close();
			}
		public static void deleteContract(int customerid) {
			Contract contract=new Contract();
			EntityManager entityManager=null;
			EntityTransaction transaction=null;
			try {
				EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
				entityManager=entityManagerFactory.createEntityManager();
				transaction=entityManager.getTransaction();
				transaction.begin();
				System.out.println("Enter custid to delete");
				customerid=sc.nextInt();
				Contract record=entityManager.find(Contract.class,customerid);
				entityManager.remove(record);
				System.out.println("contract deleted");
				transaction.commit();
			}catch(Exception e) {
				e.printStackTrace();
				transaction.rollback();
			}
			
			entityManager.close();
		}
		public static void showAllContract() {
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

			}
		}


		

