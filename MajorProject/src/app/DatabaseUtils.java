package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtils {
	
	public static Connection initializeDatabase() 
	        throws SQLException, ClassNotFoundException 
	    { 
	        String dbDriver = "com.mysql.cj.jdbc.Driver"; 
	        String dbURL = "jdbc:mysql:// localhost:3306/"; 
	        String dbName = "major-project"; 
	        String dbUsername = "root"; 
	        String dbPassword = "Ambuj@58"; 
	  
	        Class.forName(dbDriver); 
	        Connection connection = DriverManager.getConnection(dbURL + dbName, dbUsername, dbPassword); 
	        return connection; 
	    } 
	
}
