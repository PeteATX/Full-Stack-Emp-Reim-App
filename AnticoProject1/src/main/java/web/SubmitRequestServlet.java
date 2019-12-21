package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.*;
import repository.*;
import util.*;

public class SubmitRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public SubmitRequestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String amount = request.getParameter("amount");
		  float cantidad = Float.parseFloat(amount);
		  HttpSession session = request.getSession();
		  int ID = (int) session.getAttribute("user_id");
		  PedActions pedactions = new PedActionsImpl();
		  pedactions.addPedido(ID, cantidad);
		
	}

		
	}


