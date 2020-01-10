package com.capgemini.forestmgtboot.service;

import java.util.List;

import com.capgemini.forestmgtboot.dto.ContractBean;

public interface ContractService {
	boolean addContractor(ContractBean bean);

	boolean deleteContractor(int customerid);

	public ContractBean getContract(int contract_no);

	public List<ContractBean> getAllContracts();

}
