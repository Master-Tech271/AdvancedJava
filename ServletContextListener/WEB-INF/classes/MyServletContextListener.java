package com.um.listener;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;
public class MyServletContextListener implements ServletContextListener
{
	public void contextInitialized(ServletContextEvent e) {
		System.out.println("========================================="+"ServletContext Initialized!...");
		System.out.println("=========================================By "+e.getServletContext());
	}
	public void contextDestroyed(ServletContextEvent e) {
		System.out.println("========================================="+"ServletContext Destroyed!...");
		System.out.println("=========================================By "+e.getServletContext());
	}
}