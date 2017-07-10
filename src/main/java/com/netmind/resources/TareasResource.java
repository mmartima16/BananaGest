package com.netmind.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.netmind.db.DAOFactory;
import com.netmind.db.TareaDAO;
import com.netmind.models.Message;
import com.netmind.models.ProyectoB;
import com.netmind.models.TareaB;

public class TareasResource {

	@Path("/tarea") /*URL a la que atenderá las peticiones*/ 
	public class RestService { 
		TareaDAO tDAO = (TareaDAO)DAOFactory.getInstance().getDAO("tarea");
	 
	    @GET  
	    @Path("/{idTareas}") 
	    @Produces({ MediaType.APPLICATION_JSON })
	    
	    public List <TareaB> getTareasList (@PathParam("idTareas") int idTareas){
	    	List<TareaB> theTarea = tDAO.getTarea(1);
	    	return theTarea;
	    }
	}
	//POSTS, PUTS y DELETES 
		@Path("/")
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		
		public Message insertUsuario(ProyectoB nuevoUser) {
		return new Message("Usuario añadido");
		}
    
		@Path("/{idProyecto}")
		@DELETE
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		
		public Message deleteUser(@PathParam("idProyecto") int uid) {
    	return new Message("Usuario borrado");
	}
}
