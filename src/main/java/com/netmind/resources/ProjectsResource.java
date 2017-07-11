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
import javax.ws.rs.core.Response;

import com.netmind.db.DAOFactory;
import com.netmind.db.ProyectoDAO;
import com.netmind.models.Message;
import com.netmind.models.ProyectoB;

@Path("/proyectos") /* URL a la que atenderá las peticiones */
public class ProjectsResource {

	ProyectoDAO pDAO = (ProyectoDAO) DAOFactory.getInstance().getDAO("proyecto");

	// GETS
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProyectoB> getProyectos() {
		List<ProyectoB> listaProyectos = pDAO.getProyectoList();
		return listaProyectos;
	}

	@GET
	@Path("/{idProyecto}")
	@Produces({ MediaType.APPLICATION_JSON })
	public ProyectoB getPoject(@PathParam("idProyecto") int id) {

		ProyectoDAO pDAO = (ProyectoDAO) DAOFactory.getInstance().getDAO("proyecto");
		ProyectoB theProject = pDAO.getProyecto(id);
		return theProject;
	}

	// POSTS, PUTS y DELETES
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response insertUsuario(ProyectoB nuevoProyecto) {

		String result = "Project saved : " + nuevoProyecto;
		return Response.status(201).entity(result).build();
	}

	@Path("/{uid}")
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message deleteUser(@PathParam("uid") int uid) {
		return new Message("Usuario borrado");
	}

}
