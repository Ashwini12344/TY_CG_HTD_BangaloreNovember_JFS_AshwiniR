package com.capgemini.forestmgtboot.dao;

import java.util.List;

import com.capgemini.forestmgtboot.dto.ContractBean;

public interface ContractDAO {
	boolean addContractor(ContractBean bean);

	boolean deleteContractor(int customerid);

	public ContractBean getContract(int contract_no);

	public List<ContractBean> getAllContracts();

}