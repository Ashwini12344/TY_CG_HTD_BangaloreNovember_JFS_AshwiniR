package com.capgemini.mywebapp.servletsforjsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.mywebapp.beans.EmployeeInfoBean;
import com.capgemini.mywebapp.service.EmployeeService;
import com.capgemini.mywebapp.service.EmployeeServiceImpl;
@WebServlet("/updateEmployee2")
public class UpdateEmpServlet extends HttpServlet{
	private EmployeeService service=new EmployeeServiceImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		if(session!=null) {	
			int empId=Integer.parseInt(req.getParameter("empId"));
			String name=req.getParameter("name");
			String age=req.getParameter("age");
			String salary=req.getParameter("salary");
			String designation=req.getParameter("designation");
			String password=req.getParameter("password");
			EmployeeInfoBean employeeInfoBean=new EmployeeInfoBean();
			employeeInfoBean.setEmpId(empId);
			employeeInfoBean.setEmpName(name);
			if(age!=null && !age.isEmpty())
			{
				int age1=Integer.parseInt(age);
				employeeInfoBean.setAge(age1);
			}
			
			
			
			boolean isUpdated=service.updateEmployee(employeeInfoBean);
			if(isUpdated) {
				req.setAttribute("msg","Employee Details Updated Successfully");
			}
			else {
				req.setAttribute("msg", "Update Failed please Try Again!");
			}
			req.getRequestDispatcher("./updateEmpJsp");
		}else {
			req.setAttribute("msg", "Please login First");
	
	
	}

}
}