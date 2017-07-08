package com.netmind.models;

public class UsuarioB {

	private	int	uid;
	private	String	nombre;
	private	String	apellido;
	private	String	email;
	private	String	password;
	private	int	activo;
	
	//Constructor
	public UsuarioB(int uid, String nombre, String apellido, String email, String password, int activo) {
		super();
		this.uid = uid;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.password = password;
		this.activo = activo;
	}

	//getters and setters
	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}
	
	
	
}
