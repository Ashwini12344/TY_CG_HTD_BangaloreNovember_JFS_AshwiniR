package com.capgemini.fmshibernate.service;

import java.util.List;

import com.capgemini.fmshibernate.bean.Contract;
import com.capgemini.fmshibernate.dao.ContractDAO;
import com.capgemini.fmshibernate.dao.ContractDAOImpl;

public class ContractServiceImpl implements ContractService{
	ContractDAO dao=new ContractDAOImpl();
	@Override
	public boolean addContractor(Contract bean) {
		return dao.addContractor(bean);
	}

	@Override
	public boolean deleteContractor(int contractNo) {
		return dao.deleteContractor(contractNo);
	}

	@Override
	public List<Contract> showContract() {
		return dao.showContract();
	}

}
