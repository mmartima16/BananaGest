package com.netmind.models;

import java.util.Date;
import java.util.List;

public class ProyectoB {

	private int idProyecto;
	private String nombreProyecto;
	private String descProyecto;
	private String fechaFinProyecto;
	private boolean estado;
	private String uid;
	private List <TareaB> listaTareas;
	
	//Constructor
	public ProyectoB(int idProyecto, String nombreProyecto, String descProyecto, String fechaFinProyecto, boolean estado,
			String uid, List<TareaB> listaTareas) {
		super();
		this.idProyecto = idProyecto;
		this.nombreProyecto = nombreProyecto;
		this.descProyecto = descProyecto;
		this.fechaFinProyecto = fechaFinProyecto;
		this.estado = estado;
		this.uid = uid;
		this.listaTareas = listaTareas;
	}

	//Getters and Setters
	public int getIdProyecto() {
		return idProyecto;
	}

	public void setIdProyecto(int idProyecto) {
		this.idProyecto = idProyecto;
	}

	public String getNombreProyecto() {
		return nombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}

	public String getDescProyecto() {
		return descProyecto;
	}

	public void setDescProyecto(String descProyecto) {
		this.descProyecto = descProyecto;
	}

	public String getFechaFinProyecto() {
		return fechaFinProyecto;
	}

	public void setFechaFinProyecto(String fechaFinProyecto) {
		this.fechaFinProyecto = fechaFinProyecto;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public List<TareaB> getListaTareas() {
		return listaTareas;
	}

	public void setListaTareas(List<TareaB> listaTareas) {
		this.listaTareas = listaTareas;
	}
	
	
}