package com.netmind.controllers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.netmind.db.DAOFactory;
import com.netmind.db.ProyectoDAO;
import com.netmind.db.ProyectoDAOImpl;
import com.netmind.models.ProyectoB;
import com.netmind.models.UsuarioB;

@WebServlet("/PaginaprincipalServlet")
public class PaginaprincipalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger=Logger.getLogger("PaginaprincipalServlet");
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession misession= (HttpSession)request.getSession();
		
		if( misession.getAttribute("usuario")!=null ){
			UsuarioB elUsuario=(UsuarioB) misession.getAttribute("usuario");
			ProyectoDAO pDAO=(ProyectoDAO)DAOFactory.getInstance().getDAO("proyecto");
			
			List<ProyectoB> listaProyectos = pDAO.getUserProyecto(elUsuario.getUid() );
			request.setAttribute("listaProyectosAmostrar", listaProyectos);
			
			request.getRequestDispatcher("paginaprincipal.jsp").forward(request, response);
		}else{
			misession.invalidate();
			response.sendRedirect("loginServlet");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ESTOY EN POST!!");
		doGet(request, response);
	}

}
