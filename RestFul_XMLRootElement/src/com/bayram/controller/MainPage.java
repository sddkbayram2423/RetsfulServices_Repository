package com.bayram.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/kayit")
public class MainPage {
	

	@GET
	@Path("/bilgi")
	@Produces(MediaType.APPLICATION_XML)
	public Musteri getMüster() {
		Musteri musteri=new Musteri(12, "Ali", "Hale");
		return musteri;
	}
	
	@GET
	@Path("/bilgi1")
	@Produces(MediaType.TEXT_PLAIN)
	public String getMüster1() {
		
		return "Musteri musteri=new Musteri(12, \"Ali\", \"Hale\")";
	}


}
