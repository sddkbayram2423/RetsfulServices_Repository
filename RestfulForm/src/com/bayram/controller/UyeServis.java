package com.bayram.controller;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/uye")
public class UyeServis {
	
	
	@POST
	@Path("/login")
	@Produces("text/html")
	public Response login(@FormParam("adi") String adi,@FormParam("parola") String parola) {
		
		String bilgi="</br><font size='12' color='red'>Bilgi:"+ adi +parola+"</font>";
		
		return Response.status(200).entity(bilgi).build();
	}
	
	
	//http://localhost:8080/RestfulForm/rest/uye/login1/Ali/bayram
	@GET
	@Path("/login1/{adi}/{parola}")
	@Produces("text/html")
	public Response login1(@PathParam("adi") String adi,@PathParam("parola") String parola) {
		
		String bilgi="</br><font size='12' color='red'>Bilgi:"+ adi +" "+parola+"</font>";
		
		
		return Response.status(200).entity(bilgi).build();
	}


}
