package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet
{
	@Override
	public void init() throws ServletException 
	{
		System.out.print("========SecondServlet---init()========");
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
//		PrintWriter out = response.getWriter();
		// webpage
		
		// Console
		System.out.print("\n========SecondServlet---service()========");
	}
	@Override
	public void destroy() 
	{
		System.out.print("\n========SecondServlet---destroy()========");
	}
}