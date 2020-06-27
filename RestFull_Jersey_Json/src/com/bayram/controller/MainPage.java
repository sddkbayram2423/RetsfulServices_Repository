package com.bayram.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("ara")
public class MainPage {
	
	
	//http://localhost:8080/RestFull_Jersey_Json/rest/ara/xml
	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Personel getPersonelJson() {
		return new Personel(18, "Mehmet", "Kaya");
	}
	
	
	//	http://localhost:8080/RestFull_Jersey_Json/rest/ara/xml
	@GET
	@Path("/xml")
	@Produces(MediaType.TEXT_XML)
	public Personel getPersonelXml() {
		return new Personel(20, "Ayse", "Gül");
	}

}
