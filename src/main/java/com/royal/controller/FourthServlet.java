package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FourthServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		ServletConfig config = getServletConfig();
		
		String URLNAME 		= config.getInitParameter("URLNAME");
		String DRIVERCLASS  = config.getInitParameter("DRIVERCLASS");
		String USERNAME     = config.getInitParameter("USERNAME");
		String PASSWORD     = config.getInitParameter("PASSWORD");
		
		
		PrintWriter out = response.getWriter();
		out.print("<b>FourthServlet service() 		</b> :</br>");
		
		out.print("<b>URLNAME 		</b> : "+ URLNAME 	 +"</br>");
		out.print("<b>DRIVERCLASS  </b> : " + DRIVERCLASS+"</br>"  );
		out.print("<b>USERNAME     </b> : " + USERNAME   +"</br>"  );
		out.print("<b>PASSWORD     </b> : " + PASSWORD   +"</br>"  );
	}
}
