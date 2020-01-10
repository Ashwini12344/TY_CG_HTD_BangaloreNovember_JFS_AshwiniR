package com.capgemini.forestmgtboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.forestmgtboot.dao.ContractDAO;
import com.capgemini.forestmgtboot.dao.ProductDao;
import com.capgemini.forestmgtboot.dto.ContractBean;

@Service
public class ContractServiceImpl implements ContractService{
	@Autowired
	private ContractDAO dao;

	@Override
	public boolean addContractor(ContractBean bean) {
		return dao.addContractor(bean);
	}

	@Override
	public boolean deleteContractor(int customerid) {
		return dao.deleteContractor(customerid);
	}

	@Override
	public ContractBean getContract(int contract_no) {
		return dao.getContract(contract_no);
	}

	@Override
	public List<ContractBean> getAllContracts() {
		return dao.getAllContracts();
	}

}
