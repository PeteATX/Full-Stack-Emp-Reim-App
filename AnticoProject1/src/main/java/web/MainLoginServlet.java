package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;

import model.*;
import repository.*;
import util.*;


public class MainLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PedActionsImpl pedactionsimpl;
  
	public  void init() {
    	pedactionsimpl = new PedActionsImpl();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ConnectionFactory.getConnection();
		
		PedActionsImpl pa = new PedActionsImpl();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		   if(pa.Validate(username, password ))
		{
			RequestDispatcher rs = request.getRequestDispatcher("views/RequestSubmit.html");
			rs.forward(request, response);
		}
		else 
		{
			
			out.println("Username or Password Incorrect");
			RequestDispatcher rs = request.getRequestDispatcher("index.html");
			rs.include(request, response);
		}
}
}
	