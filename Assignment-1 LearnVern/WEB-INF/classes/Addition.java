package com.um.addition;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class Addition extends HttpServlet
{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		PrintWriter out = null;
		
		Integer Num1 = null, Num2 = null;

		Num1 = Integer.valueOf(req.getParameter("num1"));

		Num2 = Integer.valueOf(req.getParameter("num2"));

		out = res.getWriter();

		out.println("Result : "+(Num1+Num2));

		out.close();
	}
}