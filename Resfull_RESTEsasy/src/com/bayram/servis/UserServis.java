package com.bayram.servis;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.bayram.model.User;

@Path("/ara")
public class UserServis {
	
	
	@GET
	@Path("/xml/{id}")
	@Produces(MediaType.TEXT_XML)
	public Response getInfo(@PathParam("id") int id){
		
		User user=new User(id, "Mehmet", "Kaya");
		
		
		return  Response.status(200).entity(user).build();
	}
	
	@GET
	@Path("/json/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getInfo1(@PathParam("id") int id){
		
		User user=new User(id, "Bahar", "Atak");
		
		
		return  Response.status(200).entity(user).build();
	}

}
