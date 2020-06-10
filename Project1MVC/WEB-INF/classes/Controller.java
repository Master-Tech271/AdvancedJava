package com.umar.mvc;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;
import java.util.List;
import java.sql.SQLException;

public class Controller extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		//get data from model
		try {
		List<Food> foodItems = Model.getFood();
		request.setAttribute("foodItems", foodItems);
	} catch(ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
		//send data to view
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("menu.jsp");
		dispatcher.forward(request, response);
	}
}