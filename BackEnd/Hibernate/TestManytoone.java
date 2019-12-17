package com.capgemini.mapping.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.mapping.manytoone.EmployeeExperience;

public class TestManytoone {
	public static void main(String[] args) {
		Employee empInfo=new Employee();
		empInfo.setEid(16);
		empInfo.setName("amita");
		empInfo.setEmail("amit@gmail.com");
		empInfo.setPassword("amitt");
		EmployeeExperience exp=new EmployeeExperience();
		exp.setCname("Infosys");
		exp.setExpId(17);
		exp.setYear(6);
		exp.setEmp(empInfo);
		EmployeeExperience exp1=new EmployeeExperience();
		exp1.setCname("TCS");
		exp1.setExpId(19);
		exp1.setYear(4);
		exp1.setEmp(empInfo);
		

		
		
		
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		
		try {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		entityManager=entityManagerFactory.createEntityManager();
		 transaction=entityManager.getTransaction();

		transaction.begin();
		entityManager.persist(exp);
		entityManager.persist(exp1);
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
