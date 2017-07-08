package com.netmind.models;

public class TareaB {
	
	private int idTarea;
	private String nombreTarea;
	private String descTarea;
	private String responsable;
	private int usuariosImp;

	//Constructor
	public TareaB(int idTarea, String nombreTarea, String descTarea, String responsable, int usuariosImp) {
		super();
		this.idTarea = idTarea;
		this.nombreTarea = nombreTarea;
		this.descTarea = descTarea;
		this.responsable = responsable;
		this.usuariosImp = usuariosImp;
	}


	//getters and setters
	public int getIdTarea() {
		return idTarea;
	}

	public void setIdTarea(int idTarea) {
		this.idTarea = idTarea;
	}

	public String getNombreTarea() {
		return nombreTarea;
	}

	public void setNombreTarea(String nombreTarea) {
		this.nombreTarea = nombreTarea;
	}

	public String getDescTarea() {
		return descTarea;
	}

	public void setDescTarea(String descTarea) {
		this.descTarea = descTarea;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public int getUsuariosImp() {
		return usuariosImp;
	}

	public void setUsuariosImp(int usuariosImp) {
		this.usuariosImp = usuariosImp;
	}
	

}
