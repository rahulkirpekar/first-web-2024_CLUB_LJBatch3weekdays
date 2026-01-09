package com.royal.controller;

import java.io.IOException;

import com.royal.bean.StudentBean;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FourteenServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("FourteenServlet service() :- ");
		System.out.println("-------------------------------");
		
		// Student Data
		StudentBean s1 = new StudentBean(1, "Rahul", 12, 100);
		StudentBean s2 = new StudentBean(2, "Ankur", 10, 90);
		StudentBean s3 = new StudentBean(3, "Sagar", 11, 80);
		
		
		// get ServletContext 
		ServletContext application = getServletContext();
		application.setAttribute("student1", s1);
		application.setAttribute("student2", s2);
		application.setAttribute("student3", s3);
		
		System.out.println("FourteenServlet : Data stored in application scope(ServletContext).");
	}
}
