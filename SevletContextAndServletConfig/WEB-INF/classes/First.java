package com.um.servlet;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import java.io.IOException;
public class First extends HttpServlet
{
	public void init() throws ServletException {
		System.out.println("=============================================================");
		System.out.println("init method is call by "+this.getClass().getName());
		System.out.println("=============================================================");
	}
	 protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		ServletContext sc = getServletContext();
		res.getWriter().println("Name -: "+sc.getInitParameter("name"));
		res.getWriter().close();	
	 }

	 protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	 }
	 public void destroy() {
		System.out.println("=============================================================");
		System.out.println("destroy method is call by "+this.getClass().getName());
		System.out.println("=============================================================");
	 }
}