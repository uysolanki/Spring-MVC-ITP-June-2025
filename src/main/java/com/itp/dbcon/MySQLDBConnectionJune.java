package com.itp.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLDBConnectionJune {
	
	public static Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		String dbUrl="jdbc:mysql://localhost:3306/junedb";
		String dbUsername="root";
		String dbPassword="";
		
		Connection con=DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
		return con;
	}

}
