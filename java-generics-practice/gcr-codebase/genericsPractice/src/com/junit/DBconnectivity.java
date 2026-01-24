package com.junit;

import java.sql.*;

public class DBconnectivity {
	Connection connect=null;
	private final String URL="jdbc:mysql://localhost:3306/jdbclearning";
	private final String USER="root";
	private final String PASSWORD="Abhiji@2001";
	
	//making connection
	public void makeConnection() throws SQLException
	{
		
		connect=DriverManager.getConnection(URL,USER,PASSWORD);
		
		
	}
	
	//disconnecting
	public void disconnect() throws SQLException{
		if(connect!=null && !connect.isClosed()) {
			connect.close();
		}
	}
	
	public Connection getConnection() {
		return connect;
	}
}
