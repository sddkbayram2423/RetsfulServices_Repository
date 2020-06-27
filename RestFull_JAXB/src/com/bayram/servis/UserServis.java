package com.bayram.servis;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.bayram.model.User;

@Path("/user")
public class UserServis {
	
//	http://localhost:8080/RestFull_JAXB/rest/user/bilgi/25
	@GET
	@Path("/bilgi/{id}")
	@Produces(MediaType.TEXT_XML)
	public Response getInfo(@PathParam("id") int id){
		
		User user=new User(id, "Mehmet", "Kaya");
		
		
		return  Response.status(200).entity(user).build();
	}
	
	
//	http://localhost:8080/RestFull_JAXB/rest/user/bilgi1/25
	@GET
	@Path("/bilgi1/{id}")
	@Produces(MediaType.TEXT_XML)
	public User getInfo1(@PathParam("id") int id){
		
		User user=new User(id, "Mehmet", "Kaya");
		
		
		return  user;
	}

}
