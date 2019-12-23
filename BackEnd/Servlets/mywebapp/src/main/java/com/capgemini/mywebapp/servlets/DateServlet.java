package com.capgemini.mywebapp.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class DateServlet  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Date date=new Date();
		//get the context param
		ServletContext context=getServletContext();//without using reference we are invoking because this method is coming from generic servlet
		String contextParamVal=context.getInitParameter("myContextParam");
		//get the getConfig parameter
		ServletConfig config=getServletConfig();
		String configParamVal=config.getInitParameter("myConfigParam");
		resp.setContentType("text.html");
		resp.setHeader("refresh","1");
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<h2>Current System Date and time - "+date +"</h2>");
		out.println("<br><br>Context Param value="+contextParamVal);
		//display config param
		out.println("<br><br>Config Param value="+configParamVal);
		out.print("<html>");
		
	}
	

}//end of class
