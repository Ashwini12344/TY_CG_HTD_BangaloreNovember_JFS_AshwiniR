package com.capgemini.forestjdbc.services;
import com.capgemini.forestjdbc.services.*;
import com.capgemini.forestjdbc.dao.*;
import com.capgemini.forestjdbc.factory.*;

import java.util.List;

import com.capgemini.forestjdbc.bean.*;

public class ContractServicesImpl implements ContractServices {
	ContractDAO dao=Factory.instanceOfContractDAOImpl();
	
	public boolean addContractor(ContractBean bean) {
		return dao.addContractor(bean);
	}
	public boolean deleteContractor(int contractNo) {
		return dao.deleteContractor(contractNo);
	}
	@Override
	public List<ContractBean> showContract() {
		return dao.showContract();
	}
	
	
	

}
