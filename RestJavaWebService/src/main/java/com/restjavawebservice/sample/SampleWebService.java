package com.restjavawebservice.sample;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
/*
 * author Felix Oriedo
 * */
@Path("/testservice")
public class SampleWebService {
	
	@Path("/sample")
	@POST
	@Consumes("application/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Model getSample(Model model){
		return model;
	}

}
