package com.capgemini.forestmgtboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.forestmgtboot.dto.ContractBean;
import com.capgemini.forestmgtboot.dto.ProductBean;


@Repository
public class ContractDAOImpl implements ContractDAO {
	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
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

	@Override
	public boolean deleteContractor(int customerid) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		ContractBean bean = manager.find(ContractBean.class, customerid);
		if(bean!=null) {
			transaction.begin();
			manager.remove(bean);
			transaction.commit();
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public ContractBean getContract(int contract_no) {
		EntityManager manager = factory.createEntityManager();
		ContractBean bean=manager.find(ContractBean.class, contract_no);
		return bean;
	}

	@Override
	public List<ContractBean> getAllContracts() {
		EntityManager manager = factory.createEntityManager();
		String getall="from ContractBean";
		TypedQuery<ContractBean> query=manager.createQuery(getall,ContractBean.class);
		return query.getResultList();
	}

}
