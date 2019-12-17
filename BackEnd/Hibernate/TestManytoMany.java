package com.capgemini.mapping.onetoone;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.mapping.manytomany.TrainingInfo;

public class TestManytoMany {

	public static void main(String[] args) {
	Employee emp=new Employee();
	emp.setEid(19);
	emp.setName("Aman");
	emp.setEmail("aman@gmail.com");
	Employee emp1=new Employee();
	emp1.setEid(29);
	emp1.setName("Amanth");
	emp1.setEmail("amany@gmail.com");
	ArrayList<Employee> aList=new ArrayList<Employee>();
	aList.add(emp);
	aList.add(emp1);
	TrainingInfo tInfo=new TrainingInfo();
	tInfo.setTid(100);
	tInfo.setTname("Java Fs");
    //tInfo.set(aList);
	EntityManager entityManager=null;
	EntityTransaction transaction=null;
	
	try {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
	entityManager=entityManagerFactory.createEntityManager();
	 transaction=entityManager.getTransaction();

	transaction.begin();
	entityManager.persist(tInfo);
	System.out.println("record saved..");
	transaction.commit();
	entityManager.close();
	}catch(Exception e) {
		e.printStackTrace();
		transaction.rollback();
	}
entityManager.close();
}
	

	}

}
