package com.capgemini.forest.dao;

import com.capgemini.forest.bean.ContractBean;

public interface ContractDAO {
	boolean addContractor(ContractBean bean);
	boolean deleteContractor(int custid);
	
}