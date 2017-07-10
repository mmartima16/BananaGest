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
import com.netmind.db.ProyectoDAO;
import com.netmind.models.Message;
import com.netmind.models.ProyectoB;

public class ProjectsResource {
	@Path("/proyecto") /* URL a la que atenderá las peticiones */
	public class RestService {

		ProyectoDAO pDAO = (ProyectoDAO) DAOFactory.getInstance().getDAO("proyecto");

		// GETS
		@Path("/")
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public List<ProyectoB> getProjectsList() {
			List<ProyectoB> listaProyectos = pDAO.getUserProyecto(1);

			return listaProyectos;
		}
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
	@Path("/")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message insertUsuario(ProyectoB nuevoUser) {
		return new Message("Usuario añadido");
	}

	@Path("/{uid}")
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message deleteUser(@PathParam("uid") int uid) {
		return new Message("Usuario borrado");
	}

}
