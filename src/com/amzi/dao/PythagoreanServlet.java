
package com.amzi.dao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.amzi.dao.TulaaServicewebapp;



public class PythagoreanServlet extends HttpServlet{

    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  

    	response.setContentType("text/html"); 
		 
        PrintWriter out=response.getWriter();  
       
          
        String triplet = request.getParameter("tripletTest");  
        
        String responsemesage =   TulaaServicewebapp.hasPythagoreanTriplet(triplet); 
        
        HttpSession session = request.getSession(false);
    
        session.setAttribute("triplets", responsemesage);
          
         RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");  
         rd.forward(request,response);   

     
    }  
} 

