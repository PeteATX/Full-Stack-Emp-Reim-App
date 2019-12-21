package repository;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import util.ConnectionFactory;
import util.ConnectionClosers;
import model.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class PedActionsImpl implements PedActions {

	private static final Logger logride = LogManager.getLogger(PedActionsImpl.class);
	
	public boolean Validate(String username, String password) {
					
       
        Connection  conn = null;
        PreparedStatement stmt = null;
        ResultSet set = null;
    	boolean st = false;
    	 final String SQL = "SELECT * FROM usuario WHERE usuario=? and contrasena=? ";
        try {
         conn = ConnectionFactory.getConnection();
          stmt = conn.prepareStatement(SQL);
		  stmt.setString(1, username);
	      stmt.setString(2, password);
	      set = stmt.executeQuery();
	      	    
	      while (set.next()) {
	     st = set.getBoolean(1);
	      }
	} catch (SQLException e) {
		e.printStackTrace(); 
	
	}
        finally {
			ConnectionClosers.closeConnection(conn);
			ConnectionClosers.closeStatement(stmt);
			ConnectionClosers.closeResultSet(set);
		}
        
	return st;
}
	
	public boolean addPedido(int ID, float cantidad) {
		
		boolean submitted = false;
		 Connection  conn = null;
	        PreparedStatement stmt = null;
	        ResultSet set = null;
	    	
	    	 final String SQL = "INSERT INTO pedido VALUES(DEFAULT,DEFAULT,?,DEFAULT,DEFAULT,0)";
	
	    	 try {
	             conn = ConnectionFactory.getConnection();
	              stmt = conn.prepareStatement(SQL);
	    		  stmt.setInt(1, ID);
	    	      stmt.setFloat(2, cantidad);
	    	     
	    	      
	    	      set = stmt.executeQuery();
	    	      submitted = true;
	}    catch (SQLException e) {
		e.printStackTrace(); 
	
	}
        finally {
			ConnectionClosers.closeConnection(conn);
			ConnectionClosers.closeStatement(stmt);
			ConnectionClosers.closeResultSet(set);
		}
	
	    return submitted;
	}

	
}




