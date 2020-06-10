package com.um.servlet;
import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;
import javax.servlet.ServletContext;
public class FirstServlet extends GenericServlet{
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		//get servlet context object 
		ServletContext sc = getServletContext();
		//set attribute in servlet context
		sc.setAttribute("Name", "Mohd Umar");
		sc.setAttribute("UserName-1", "Master-Tech271");
		sc.setAttribute("UserName-2", "umar17605");

		//link of second servlet where this attribute value show
		res.getWriter().append("<a href='Servlet2'>Visit</a>");
	}
}