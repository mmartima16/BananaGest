package com.netmind.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

public class ProjectsResource {
	@Path("/projects") /*URL a la que atenderá las peticiones*/ 
	public class RestService { 
	 
	    @GET  
	    @Path("/{pid}") 
	    @Consumes({ MediaType.APPLICATION_JSON })
	    
	    public Projects getProject (@PathParam("pid") int id){
	    	Projects theProject = new Projects(1, "proj1", "proyecto primero", "5/09/2017", true, null);
	    	return theProject;
	    }
	}
	    
	    	
	    

}

