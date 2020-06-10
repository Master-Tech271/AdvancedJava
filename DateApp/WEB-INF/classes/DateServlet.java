package com.um.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DateServlet extends GenericServlet
{
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
		PrintWriter pw = null;
		res.setContentType("text/html");
		pw = res.getWriter();
		pw.println("<h1 style='text-align:center'>"+ new java.util.Date() + "</h1>");
		pw.close();
	}
}