package com.capgemini.forestjdbc.services;
import java.util.List;

import com.capgemini.forestjdbc.bean.ContractBean;

public interface ContractServices {
	
		public boolean addContractor(ContractBean bean);
		public boolean deleteContractor(int contractNo);
		public List<ContractBean> showContract();

		
		}




