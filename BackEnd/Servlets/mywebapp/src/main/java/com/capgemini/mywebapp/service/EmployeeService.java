package com.capgemini.mywebapp.service;

import java.util.List;

import com.capgemini.mywebapp.beans.EmployeeInfoBean;

public interface EmployeeService {
	public EmployeeInfoBean authenticate(int empId,String password);
	public EmployeeInfoBean searchEmployee(int empId);
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean);
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean);
	public boolean deleteEmployee(int empId);
	public List<EmployeeInfoBean> getAllEmployees();

}
