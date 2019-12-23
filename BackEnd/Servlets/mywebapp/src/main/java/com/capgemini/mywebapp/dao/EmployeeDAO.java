package com.capgemini.mywebapp.dao;

import java.util.List;

import com.capgemini.mywebapp.beans.EmployeeInfoBean;



public interface EmployeeDAO {
	public EmployeeInfoBean authenticate(int empId,String password);
	public EmployeeInfoBean searchEmployee(int empId);
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean);
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean);
	public boolean deleteEmployee(int empId);
	public List<EmployeeInfoBean> getAllEmployees();


}
