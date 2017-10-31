package com.ss.com.NewApi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class LoginHandler {
public ArrayList<User> getAllusersList(Connection con) throws Exception{
	ArrayList<User> userList = new ArrayList<User>();
	try {
	Statement ps = con.createStatement();
		ResultSet rs = ps.executeQuery("select * from login");
		while(rs.next()) {
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			userList.add(user);
		}
		return userList;
	}catch(Exception e) {
		throw e;
	}
	
}
}
