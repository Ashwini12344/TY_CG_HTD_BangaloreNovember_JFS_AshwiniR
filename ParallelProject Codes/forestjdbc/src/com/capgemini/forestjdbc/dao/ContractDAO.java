package com.capgemini.forestjdbc.dao;

import java.util.List;

import com.capgemini.forestjdbc.bean.ContractBean;

public interface ContractDAO {
	boolean addContractor(ContractBean bean);
	boolean deleteContractor(int contractNo);
	public  List<ContractBean> showContract();
	

}
