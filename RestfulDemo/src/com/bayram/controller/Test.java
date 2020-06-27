package com.bayram.controller;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path(value = "/test")
public class Test {
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/metod")
	public String test() {
		
		
		return "Test";
	}
	
	@GET
	@Produces("text/html")
	@Path("/metod2")
	public String test2() {
		String sor=	"<h2>Basic HTML Table</h2> <table style="+"width:40%"+">"+
				 " <tr><th>Firstname</th> <th>Lastname</th> <th>Age</th> </tr>"+
				  "<tr> <td>Jill</td><td>Smith</td><td>50</td></tr>"+
				 " <tr><td>Eve</td><td>Jackson</td><td>94</td> </tr>"+
				"  <tr><td>John</td><td>Doe</td><td>80</td></tr>"+
				"</table>";
				
	
		
		return "</br></br><font color=\"red\" >Hello World</font>"+sor;
	}


}
