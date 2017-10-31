package com.ss.com.NewApi;

import java.sql.Connection;
import java.util.ArrayList;


public class SecurityManager {
public ArrayList<User> getAllUserList() throws Exception{
	ArrayList<User> userList = null;
	try {
		DbConnectivity db = new DbConnectivity();
		Connection connection = db.getConnection();
		LoginHandler lh = new LoginHandler();
		userList = lh.getAllusersList(connection);
	} catch(Exception e) {
		throw e;
	}
	return userList;
}

public String getUsers(String username, String password) {
	try{
		ArrayList<User> users = this.getAllUserList();
		for(User us: users) {
			if(us.getUsername().equals(username) && us.getPassword().equals(password)) {
				System.out.println("username: "+username);
					System.out.println("Password: "+password);
					return "Logged in user: "+username;
			}
			
		}
	} catch(Exception e) {
		System.out.println("error");
	}
	return "You are not a valid user";
}


}
