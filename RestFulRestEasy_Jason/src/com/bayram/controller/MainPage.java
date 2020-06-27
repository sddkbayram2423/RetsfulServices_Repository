package com.bayram.controller;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bayram.model.Personel;

@Path("/ara")
public class MainPage {
	
//	http://localhost:8080/RestFulRestEasy_Jason/ara/json
	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Personel getPersonelJson() {
		return new Personel(5, "Sultan", "Kaya");
	}
	
	
	
//	http://localhost:8080/RestFulRestEasy_Jason/ara/xml
	@GET
	@Path("/xml")
	@Produces(MediaType.TEXT_XML)
	public Personel getPersonelXml() {
		return new Personel(15, "Zahide", "Gül");
	}

}
