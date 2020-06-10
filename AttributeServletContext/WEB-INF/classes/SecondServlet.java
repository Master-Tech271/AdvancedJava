package com.um.servlet;
import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;
import javax.servlet.ServletContext;
public class SecondServlet extends GenericServlet{
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		//get servlet context object 
		ServletContext sc = getServletContext();
		//get attribute in servlet context
		res.getWriter().println("Name -: "+sc.getAttribute("Name"));
		//take all the user names
		java.util.Enumeration<String> userNames = sc.getAttributeNames();
		String name = null;
		while(userNames.hasMoreElements()) {
			name = userNames.nextElement();
			res.getWriter().println(name+" -: "+sc.getAttribute(name));
		}
	}
}