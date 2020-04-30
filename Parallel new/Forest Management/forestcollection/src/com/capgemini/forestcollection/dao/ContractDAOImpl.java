package com.capgemini.forestcollection.dao;

import java.util.List;

import com.capgemini.forestcollection.bean.ContractBean;
import com.capgemini.forestcollection.exception.ForestException;

import java.util.ArrayList;

public class ContractDAOImpl implements ContractDAO {
	private List<ContractBean> contractbean=new ArrayList<ContractBean>();

	@Override
	public boolean addContractor(ContractBean bean) {
		for (ContractBean contractBean : contractbean) {
			if(contractBean.getCustid()==bean.getCustid()) {
				return false;
			}
			else {
				contractbean.add(bean);
				System.out.println("Contract details added");
				return true;
				
				}
			
		}
		return true;
		//throw new ForestException("Contract Number already exists");
		
	}

	@Override
	public boolean deleteContractor(int custid) {
		ContractBean bean=null;
		for (ContractBean contractBean : contractbean) {
			if(contractBean.getCustid()==custid) {
				contractbean.remove(bean);
				return true;
				}
		
			}
		return true;
		
		}
		
		}
			
	

