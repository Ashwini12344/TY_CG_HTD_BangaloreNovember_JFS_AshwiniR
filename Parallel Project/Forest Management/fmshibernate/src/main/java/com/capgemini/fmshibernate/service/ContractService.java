package com.capgemini.fmshibernate.service;

import java.util.List;

import com.capgemini.fmshibernate.bean.Contract;

public interface ContractService {
	public boolean addContractor(Contract bean);

	public boolean deleteContractor(int contractNo);

	public List<Contract> showContract();

}
