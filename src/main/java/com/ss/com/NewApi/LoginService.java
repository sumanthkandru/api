package com.ss.com.NewApi;


import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/login")
@Produces("application/json")
@Consumes("application/json")

public class LoginService {
  
    
	@POST
    public String getUser(@HeaderParam("username") String username,@HeaderParam("password") String password) {
    	SecurityManager sm = new SecurityManager();
    System.out.println("called!");
    	return sm.getUsers(username, password);
  
    }

	
}
