package com.umar.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DBManager {
	
	@Value("${query.selectAll}")
	private String selectAll;
	
	@Value("${db.url}")
	private String url;
	@Value("${db.userName}")
	private String userName;
	@Value("${db.password}")
	private String password;
	@Value("${db.dbClassFile}")
	private String dbClassFile;
	
	private Connection con = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	
	private int id;
	private String item;
	private float price;
	
	
	//select query 
	public void selectRecord() {
		try {
			//load database class
			Class.forName(dbClassFile);
			//get connection
			if(con==null)
				con = DriverManager.getConnection(url, userName, password);
			
			//create stmt
			if(stmt==null)
				stmt = con.createStatement();
			
			//execute query
			if(rs==null)
				rs = stmt.executeQuery(selectAll);
			
			//print all records
			while(rs.next()) {
				id = rs.getInt(1);
				item = rs.getString(2);
				price = rs.getFloat(3);
				
				System.out.println("ID = "+id+"\nItem = "+item+"\nPrice = "+price+"\n\t======================================================");
			}
					
			
		}
		catch(ClassNotFoundException cnfe) {
			System.out.println("Database Class Not Found!..");
		}
		catch(SQLException sqle) {
			sqle.printStackTrace();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//close the resources
		finally {
			try {
			if(con!=null) {
				con.close();
				con = null;
				stmt = null;
				rs = null;
			}
			} 
			catch (SQLException sqlee) {
				System.out.println("Connection close problem!..");
			}
			catch(Exception ee) {
				ee.printStackTrace();
			}
			
		}
		
	}
	
	//insertion, deletion, updation query 
		public boolean manipulationRecord(String query) {
			boolean flag = false;
			try {
				//load database class
				Class.forName(dbClassFile);
				//get connection
				if(con==null)
					con = DriverManager.getConnection(url, userName, password);
				
				//create stmt
				if(stmt==null)
					stmt = con.createStatement();
				
				//execute query
					flag = stmt.executeUpdate(query) > 0 ? true : false ;
				
						
				
			}
			catch(ClassNotFoundException cnfe) {
				System.out.println("Database Class Not Found!..");
			}
			catch(SQLException sqle) {
				sqle.printStackTrace();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			//close the resources
			finally {
				try {
					if(con!=null) {
						con.close();
						con = null;
						stmt = null;
						rs = null;
					}
				} 
				catch (SQLException sqlee) {
					System.out.println("Connection close problem!..");
				}
				catch(Exception ee) {
					ee.printStackTrace();
				}
				
			}
			
			return flag;
			
		}

}
