package com.capgemini.mywebapp.servletsforjsp;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.mywebapp.beans.EmployeeInfoBean;
import com.capgemini.mywebapp.service.EmployeeService;
import com.capgemini.mywebapp.service.EmployeeServiceImpl;
@WebServlet("/seeAllEmployee")
public class SeeAllEmployees  extends HttpServlet{
	private EmployeeService service=new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {
			List<EmployeeInfoBean> employeeList=service.getAllEmployees();
			if(employeeList!=null && !employeeList.isEmpty()) {
				req.setAttribute("employeeList",employeeList);
				req.getRequestDispatcher("./seeAllEmployeeJsp.jsp").forward(req, resp);
			}
			
		}else {
			req.setAttribute("msg", "Please login First");
			req.getRequestDispatcher("./loginFormJsp").forward(req, resp);
		}
		
	}

}
