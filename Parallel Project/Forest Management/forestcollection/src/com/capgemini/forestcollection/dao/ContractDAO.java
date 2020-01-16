package com.capgemini.forestcollection.dao;

import com.capgemini.forestcollection.bean.ContractBean;

public interface ContractDAO {
	boolean addContractor(ContractBean bean);
	boolean deleteContractor(int custid);
	
}
