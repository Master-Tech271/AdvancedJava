package com.um.calculator;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class Calculator extends HttpServlet
{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		PrintWriter out = null;
		
		Integer Num1 = null, Num2 = null;

		String Calculation_Type = null;

		Calculation_Type = req.getParameter("calculation_type").toString();

		out = res.getWriter();

		try{

		Num1 = Integer.valueOf(req.getParameter("num1"));

		Num2 = Integer.valueOf(req.getParameter("num2"));

		if(Calculation_Type.equals("addition"))

			out.println("Result : "+(Num1+Num2));
		
		if(Calculation_Type.equals("subtraction"))

			out.println("Result : "+(Num1-Num2));

		if(Calculation_Type.equals("multiplication"))

			out.println("Result : "+(Num1*Num2));

		if(Calculation_Type.equals("division"))

			out.println("Result : "+(Num1/Num2));

		out.close();
		}
		catch(Exception e){
			out.println("Something Wrong");
			out.close();
		}
	}
}