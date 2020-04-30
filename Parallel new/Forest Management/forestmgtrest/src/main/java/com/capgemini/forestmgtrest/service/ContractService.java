package com.capgemini.forestmgtrest.service;

import java.util.List;

import com.capgemini.forestmgtrest.dto.ContractBean;
public interface ContractService {
	boolean addContractor(ContractBean bean);

	boolean deleteContractor(int customerid);

	public ContractBean getContract(int contract_no);

	public List<ContractBean> getAllContracts();

}