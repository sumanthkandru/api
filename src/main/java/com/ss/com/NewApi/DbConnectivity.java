package com.ss.com.NewApi;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnectivity {
	
public Connection getConnection() throws Exception{
	try {
		String connectionURL = "jdbc:mysql://localhost:3306/sample";
		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(connectionURL,"root","root");
		return con;
	} catch(Exception e) {
		throw e;
	}
}
}
