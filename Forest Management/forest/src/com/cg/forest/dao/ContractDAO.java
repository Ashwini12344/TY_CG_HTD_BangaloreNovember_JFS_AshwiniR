package com.cg.forest.dao;

import com.cg.forest.bean.ContractBean;

public interface ContractDAO {
	boolean addContractor(ContractBean bean);
	boolean deleteContractor(int custid);
	
}
