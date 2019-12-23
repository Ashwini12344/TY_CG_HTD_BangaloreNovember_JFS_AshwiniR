package com.capgemini.mywebapp.servletsforjsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.mywebapp.beans.EmployeeInfoBean;
import com.capgemini.mywebapp.service.EmployeeService;
import com.capgemini.mywebapp.service.EmployeeServiceImpl;

public class DeleteJspServlet extends HttpServlet{
	private EmployeeService service=new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		if(session!=null) {
			int empId=Integer.parseInt(req.getParameter("empId"));
			EmployeeInfoBean employeeInfoBean=new EmployeeInfoBean();
			boolean isDeleted=service.deleteEmployee(empId);
			if(isDeleted) {
			req.setAttribute("msg","Record for employee id"+empId+"Deleted");
			
			
		}
			else{
				req.setAttribute("msg", "EmployeeId"+empId+"Not found");
			}
			req.getRequestDispatcher("./deleteFormJsp.jsp").include(req, resp);
				
			}
			else {
			req.setAttribute("msg", "please login first");
			req.getRequestDispatcher("./loginForm").forward(req, resp);
		}
		
	}

}
