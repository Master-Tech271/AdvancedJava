package com.umar.mvc;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Model {
	public static List<Food> getFood() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/testing?useSSL=false";
		String username = "root";
		String password = "";

		ArrayList<Food> food = new ArrayList();

		//load the mysql driver
		Class.forName("com.mysql.jdbc.Driver");
	

		//get the connection
		Connection con = DriverManager.getConnection(url, username, password);
		//create the statment
		Statement stmt = con.createStatement();

		//execute the statment
		ResultSet rs = stmt.executeQuery("Select * from foodcart");

		while(rs.next()) {
			int id = rs.getInt(1);
			String item = rs.getString(2);
			float price = rs.getFloat(3);
			Food f = new Food(id, item, price);
			food.add(f);
		}
		return food;
	}
}