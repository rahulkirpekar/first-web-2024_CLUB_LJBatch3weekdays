package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.royal.bean.StudentBean;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InsertStudentServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 String fullname =  request.getParameter("fullname");
		 String age =  request.getParameter("age");
		 String course =  request.getParameter("course");
		 String gender =  request.getParameter("gender");
		 
//		 String hobby =  request.getParameter("hobby");
		 
		 String hobbies[] = request.getParameterValues("hobby");
		 
		 String hobbiesStr ="";
		 
		 for (int i = 0; i < hobbies.length; i++) 
		 {
			 if (i< hobbies.length-1)
			 {
				 hobbiesStr = hobbiesStr+ hobbies[i]+",";
				
			} else 
			{
				 hobbiesStr = hobbiesStr+ hobbies[i]+".";
			} 
		}
		 
		 String dob =  request.getParameter("dob");
		 String email =  request.getParameter("email");
		 String mobile =  request.getParameter("mobile");
		 String address =  request.getParameter("address");
	
		 
		 PrintWriter out = response.getWriter();
		 
		 
		 out.println("<b>fullname:</b>"+ fullname+"<br>");
		 out.println("<b>age:</b>"+ age+"<br>");
		 out.println("<b>course:</b>"+ course+"<br>");
		 out.println("<b>gender:</b>"+ gender+"<br>");
		 out.println("<b>hobby:</b>"+ hobbiesStr +"<br>");
		 out.println("<b>dob:</b>"+ dob+"<br>");
		 out.println("<b>email:</b>"+ email+"<br>");
		 out.println("<b>mobile:</b>"+ mobile+"<br>");
		 out.println("<b>address:</b>"+ address+"<br>");
	}
}
