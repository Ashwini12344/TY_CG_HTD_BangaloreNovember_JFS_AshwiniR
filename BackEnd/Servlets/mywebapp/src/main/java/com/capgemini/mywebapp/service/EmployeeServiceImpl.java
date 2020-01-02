package com.capgemini.mywebapp.service;

import java.util.List;

import com.capgemini.mywebapp.beans.EmployeeInfoBean;
import com.capgemini.mywebapp.dao.EmployeeDAO;
import com.capgemini.mywebapp.dao.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO dao=new EmployeeDAOImpl();

	@Override
	public EmployeeInfoBean searchEmployee(int empId) {
	
		return dao.searchEmployee(empId);
	}

	@Override
	public EmployeeInfoBean authenticate(int empId, String password) {
	return dao.authenticate(empId, password);
	}

	@Override
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {
		return dao.addEmployee(employeeInfoBean);
	}

	@Override
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean) {
		return false;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(empId);
	}

	@Override
	public List<EmployeeInfoBean> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}


}