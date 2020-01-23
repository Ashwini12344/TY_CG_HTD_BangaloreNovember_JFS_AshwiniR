package com.capgemini.forestmgtrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.capgemini.forestmgtrest.dto.ContractBean;

public class ContractDAOImpl implements ContractDAO {

	public boolean addContractor(ContractBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean deleteContractor(int customerid) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public ContractBean getContract(int contract_no) {
		EntityManager manager = factory.createEntityManager();
		ContractBean bean=manager.find(ContractBean.class, contract_no);
		return bean;	}

	public List<ContractBean> getAllContracts() {
		EntityManager manager = factory.createEntityManager();
		String getall="from ContractBean";
		TypedQuery<ContractBean> query=manager.createQuery(getall,ContractBean.class);
		return query.getResultList();

	}

}
