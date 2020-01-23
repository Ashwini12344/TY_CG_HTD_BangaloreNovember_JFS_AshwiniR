package com.capgemini.forestmgtrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.forestmgtrest.dao.ContractDAO;
import com.capgemini.forestmgtrest.dto.ContractBean;


@Service
public class ContractServiceImpl implements ContractService{
	@Autowired
	private ContractDAO dao;

	public boolean addContractor(ContractBean bean) {
		return dao.addContractor(bean);
	}

	public boolean deleteContractor(int customerid) {
		return dao.deleteContractor(customerid);
	}

	public ContractBean getContract(int contract_no) {
		return dao.getContract(contract_no);
	}

	public List<ContractBean> getAllContracts() {
		return dao.getAllContracts();
	}

}
