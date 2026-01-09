package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
 * 
 * Servlet Colloboration:-
-----------------------
	FirstServlet----------->SecondServlet


1. request:-
-------------

	FirstServlet

		service()
		{
			RequestDispacher rd = request.getRequestDispacher("SecondServlet");
			rd.forward(request,response);
		}



2. response:-
-------------
 * */

public class FirstServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.sendRedirect("https://www.google.com");
		
//		PrintWriter out = response.getWriter();
		
		// webpage
//		out.print("<h1>FirstServlet---Hello I am Servlet</h1>");
		
//		System.out.println("FirstServlet---Hello I am Servlet");
		
//		RequestDispatcher rd = request.getRequestDispatcher("SecondServlet");
//		rd.forward(request,response);
//		rd.include(request,response);
		
		// System.out---Console
//		System.out.println("FirstServlet---Hello I am Servlet");
	}
}