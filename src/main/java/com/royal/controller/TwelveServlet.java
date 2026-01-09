package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.royal.bean.StudentBean;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class TwelveServlet  extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession();
		
		response.setContentType("text/html");
		
		StudentBean s1 = (StudentBean)session.getAttribute("student1");
		StudentBean s2 = (StudentBean)session.getAttribute("student2");
		StudentBean s3 = (StudentBean)session.getAttribute("student3");
		
		PrintWriter out = response.getWriter();
		
		out.println("TwelveServlet : <br>");
		out.println(s1.getRno()+" " + s1.getName()+" " + s1.getStd()+"<br>");
		out.println(s2.getRno()+" " + s2.getName()+" " + s2.getStd()+"<br>");
		out.println(s3.getRno()+" " + s3.getName()+" " + s3.getStd()+"<br>");
		
		session.removeAttribute("student3");
		
	}
}

