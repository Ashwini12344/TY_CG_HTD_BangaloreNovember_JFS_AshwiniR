package com.capgemini.mapping.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.annotations.SourceType;

public class TestOneToOne {
	public static void main(String[] args) {
		Employee empInfo=new Employee();
		empInfo.setEid(12);
		empInfo.setName("Ram");
		empInfo.setEmail("ram@gmail.com");
		empInfo.setPassword("rama");
		EmployeeOther other=new EmployeeOther();
		other.setId(10);
		other.setEmpInfo(empInfo);
		other.setFname("raghu");
		other.setMname("savi");
		
		
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		
		try {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		entityManager=entityManagerFactory.createEntityManager();
		 transaction=entityManager.getTransaction();

		transaction.begin();
		Employee e=entityManager.find(Employee.class, 13);
		//System.out.println(e.g);
		//entityManager.persist(other);
		//System.out.println("record saved..");
		transaction.commit();
		entityManager.close();
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
entityManager.close();
	}

		
	}


