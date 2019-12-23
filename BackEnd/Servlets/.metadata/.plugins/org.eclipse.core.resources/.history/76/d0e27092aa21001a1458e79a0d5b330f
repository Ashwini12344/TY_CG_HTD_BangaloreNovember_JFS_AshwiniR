package com.capgemini.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/getEmployee4")
public class GetEmployeeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		//get context-param:pass info to all the servlet
		ServletContext context=getServletContext();
		String contextParamVal=context.getInitParameter("myContextParam");
		
		//get config-param:pass to particular servlet
		ServletConfig config=getServletConfig();
		String configParamVal=config.getInitParameter("myConfigParam");
		
		String idVal=req.getParameter("id");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Employee id= "+idVal);
		out.println("Name=Ashwini");
		out.println("Salary= 28000");
		out.println("<br><br>Context Param value="+contextParamVal);
		out.println("<br><br>Config Param value="+configParamVal);
		out.println("</body>");
		out.println("</html>");
		
	}//end of doGet

}//end of class
