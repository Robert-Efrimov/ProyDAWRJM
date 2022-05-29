package com.model;

public class administradores {

	String correo_adm;
	String contra_adm;
	public administradores(String correo_adm, String contra_adm) {
		super();
		this.correo_adm = correo_adm;
		this.contra_adm = contra_adm;
	}
	public String getCorreo_adm() {
		return correo_adm;
	}
	public void setCorreo_adm(String correo_adm) {
		this.correo_adm = correo_adm;
	}
	public String getContra_adm() {
		return contra_adm;
	}
	public void setContra_adm(String contra_adm) {
		this.contra_adm = contra_adm;
	}

}
