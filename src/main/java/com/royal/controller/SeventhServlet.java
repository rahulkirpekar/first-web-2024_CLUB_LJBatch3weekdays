package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SeventhServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		
		out.print("<b>SeventhServlet </b> : </br>");
		
		ServletContext context = request.getServletContext();
		
		Enumeration<String> e = context.getInitParameterNames();

		
		while(e.hasMoreElements()) 
		{
			String paramName = e.nextElement();
			
			String paramValue = context.getInitParameter(paramName);
			
			out.print("<b>"+paramName+" </b> : " + paramValue+"</br>");
		}
	}
}
