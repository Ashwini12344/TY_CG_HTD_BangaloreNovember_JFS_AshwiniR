package com.capgemini.mywebapp.servletsforjsp;
import javax.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.mywebapp.beans.EmployeeInfoBean;
import com.capgemini.mywebapp.service.EmployeeService;
import com.capgemini.mywebapp.service.EmployeeServiceImpl;
@WebServlet("/addEmployee1")
public class AddEmpServletJsp extends HttpServlet{
	private EmployeeService service=new EmployeeServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {
			int empId=Integer.parseInt(req.getParameter("empId"));
			String name=req.getParameter("name");
			int age=Integer.parseInt(req.getParameter("age"));
			double salary=Double.parseDouble(req.getParameter("salary"));
			String designation=req.getParameter("designation");
			String password=req.getParameter("password");
			EmployeeInfoBean employeeInfoBean=new EmployeeInfoBean();
			employeeInfoBean.setEmpId(empId);
			employeeInfoBean.setAge(age);
			employeeInfoBean.setDesignation(designation);
			employeeInfoBean.setEmpName(name);
			employeeInfoBean.setPassword(password);
			employeeInfoBean.setSalary(salary);
			service.addEmployee(employeeInfoBean);
			boolean isAdded=service.addEmployee(employeeInfoBean);
			req.setAttribute("employeeInfoBean", employeeInfoBean);
			req.getRequestDispatcher("./AddEmpFormJsp.jsp").include(req, resp);
			
		}else {
			req.setAttribute("msg", "please login first");
			req.getRequestDispatcher("./loginForm").forward(req, resp);
		}
		
		}
	}


