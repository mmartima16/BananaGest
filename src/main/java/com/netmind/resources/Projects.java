package com.netmind.resources;

import java.util.Date;
import java.util.List;

import com.netmind.models.TareaB;

public class Projects {
	
	private int pid;
	private String nameProj;
	private String description;
	private String fechaFinProyecto;
	private boolean estado;
	private List <TareaB> listaTareas;
	
	public Projects(int pid, String nameProj, String description, String fechaFinProyecto, boolean estado,
			List<TareaB> listaTareas) {
		super();
		this.pid = pid;
		this.nameProj = nameProj;
		this.description = description;
		this.fechaFinProyecto = fechaFinProyecto;
		this.estado = estado;
		this.listaTareas = listaTareas;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getNameProj() {
		return nameProj;
	}
	public void setNameProj(String nameProj) {
		this.nameProj = nameProj;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public List<TareaB> getListaTareas() {
		return listaTareas;
	}
	public void setListaTareas(List<TareaB> listaTareas) {
		this.listaTareas = listaTareas;
	}
}
