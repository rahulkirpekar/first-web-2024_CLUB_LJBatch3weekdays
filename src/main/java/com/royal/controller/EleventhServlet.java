package com.royal.controller;

import java.io.IOException;

import com.royal.bean.StudentBean;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class EleventhServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// session create
		HttpSession session =  request.getSession();
		
		// Data
		StudentBean s1 = new StudentBean(1, "Rahul", 12, 70);
		StudentBean s2 = new StudentBean(2, "Ankur", 10, 80);
		StudentBean s3 = new StudentBean(3, "Rakesh", 1, 90);
		
		// data store--request
					//			key  , value
		session.setAttribute("student1", s1);
		session.setAttribute("student2", s2);
		session.setAttribute("student3", s3);
	}
}
