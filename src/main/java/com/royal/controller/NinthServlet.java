package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.royal.bean.StudentBean;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NinthServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		
		StudentBean s1 = (StudentBean)request.getAttribute("student1");
		StudentBean s2 = (StudentBean)request.getAttribute("student2");
		StudentBean s3 = (StudentBean)request.getAttribute("student3");
		
		PrintWriter out = response.getWriter();
		
		out.println("NinthServlet : <br>");
		out.println(s1.getRno()+" " + s1.getName()+" " + s1.getStd()+"<br>");
		out.println(s2.getRno()+" " + s2.getName()+" " + s2.getStd()+"<br>");
		out.println(s3.getRno()+" " + s3.getName()+" " + s3.getStd()+"<br>");
		
		request.removeAttribute("student3");
		
		RequestDispatcher rd = request.getRequestDispatcher("TenthServlet");
		rd.forward(request, response);
	}
}
